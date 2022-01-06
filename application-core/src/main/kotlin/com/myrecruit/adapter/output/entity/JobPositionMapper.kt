package com.myrecruit.adapter.output.entity

import com.myrecruit.domain.JobPosition
import org.springframework.stereotype.Component

@Component
class JobPositionMapper {
    fun toJpaEntity(jobPosition: JobPosition): JobPositionEntity {
        return JobPositionEntity(
            jobPosition.id,
            jobPosition.name,
            jobPosition.description,
            jobPosition.createRecruiterId,
            jobPosition.open,
        )
    }

    fun toDomainEntity(jobPositionEntity: JobPositionEntity): JobPosition {
        return JobPosition.with(
            jobPositionEntity.id,
            jobPositionEntity.name,
            jobPositionEntity.description,
            jobPositionEntity.createRecruiterId,
            jobPositionEntity.open,
        )
    }
}
