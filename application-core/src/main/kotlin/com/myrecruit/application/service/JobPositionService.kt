package com.myrecruit.application.service

import com.myrecruit.application.port.input.RegisterNewJobPositionPort
import com.myrecruit.application.port.output.GetRecruiterPort
import com.myrecruit.application.port.output.SaveJobPositionPort
import com.myrecruit.domain.JobPosition
import org.springframework.stereotype.Service

@Service
class JobPositionService(
    private val getRecruiterPort: GetRecruiterPort,
    private val saveJobPositionPort: SaveJobPositionPort,
) : RegisterNewJobPositionPort {
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
}
