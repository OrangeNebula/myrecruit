package com.myrecruit.adapter.output

import com.myrecruit.adapter.output.entity.JobPositionEntity
import org.springframework.data.jpa.repository.JpaRepository

interface JobPositionRepository : JpaRepository<JobPositionEntity, Long> {
    fun save(jobPositionEntity: JobPositionEntity)

    fun findByIdOrNull(id: Long): JobPositionEntity?
}
