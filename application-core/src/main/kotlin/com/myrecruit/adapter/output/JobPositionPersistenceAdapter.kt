package com.myrecruit.adapter.output

import com.myrecruit.adapter.output.entity.JobPositionMapper
import com.myrecruit.application.port.output.FindJobPositionPort
import com.myrecruit.application.port.output.SaveJobPositionPort
import com.myrecruit.application.port.output.UpdateJobPositionPort
import com.myrecruit.domain.JobPosition
import org.springframework.stereotype.Component

@Component
class JobPositionPersistenceAdapter(
    val mapper: JobPositionMapper,
    val repository: JobPositionRepository,
) : SaveJobPositionPort, UpdateJobPositionPort, FindJobPositionPort {
    override fun saveJobPosition(jobPosition: JobPosition): JobPosition {
        val jobPositionEntity = this.mapper.toJpaEntity(jobPosition)
        this.repository.save(jobPositionEntity)
        return jobPosition
    }

    override fun updateJobPosition(jobPosition: JobPosition): JobPosition {
        val jobPositionEntity = this.mapper.toJpaEntity(jobPosition)
        this.repository.save(jobPositionEntity);
        return jobPosition
    }

    override fun findJobPositionById(jobPositionId: Long): JobPosition? {
        val entity = this.repository.findByIdOrNull(jobPositionId) ?: return null
        return this.mapper.toDomainEntity(entity)
    }
}
