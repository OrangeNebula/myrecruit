package com.myrecruit.application.service

import com.myrecruit.application.port.input.CloseJobPositionPort
import com.myrecruit.application.port.input.OpenJobPositionPort
import com.myrecruit.application.port.input.RegisterNewJobPositionPort
import com.myrecruit.application.port.output.FindJobPositionPort
import com.myrecruit.application.port.output.GetRecruiterPort
import com.myrecruit.application.port.output.SaveJobPositionPort
import com.myrecruit.domain.JobPosition
import javassist.NotFoundException
import org.springframework.stereotype.Service

@Service
class JobPositionService(
    private val getRecruiterPort: GetRecruiterPort,
    private val saveJobPositionPort: SaveJobPositionPort,
    private val findJobPositionPort: FindJobPositionPort,
) : RegisterNewJobPositionPort, OpenJobPositionPort, CloseJobPositionPort {
    override fun registerNewJobPosition(
        recruiterId: Long,
        jobPositionName: String,
        jobPositionDescription: String
    ): JobPosition {
        val recruiter = this.getRecruiterPort.getRecruiterById(recruiterId)
        val jobPosition = recruiter.createJobPosition(0, jobPositionName, jobPositionDescription)
        this.saveJobPositionPort.saveJobPosition(jobPosition)
        return jobPosition
    }

    override fun closeJobPosition(recruiterId: Long, jobPositionId: Long): JobPosition {
        val jobPosition: JobPosition = this.findJobPositionPort.findJobPositionById(jobPositionId) ?: throw NotFoundException("")
        jobPosition.close()
        this.saveJobPositionPort.saveJobPosition(jobPosition)
        return jobPosition
    }

    override fun openJobPosition(recruiterId: Long, jobPositionId: Long): JobPosition {
        val jobPosition: JobPosition = this.findJobPositionPort.findJobPositionById(jobPositionId) ?: throw NotFoundException("")
        jobPosition.open()
        this.saveJobPositionPort.saveJobPosition(jobPosition)
        return jobPosition
    }
}
