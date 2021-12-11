package com.myrecruit.application.port.output

import com.myrecruit.domain.model.JobPosition

interface CreateJobPositionPort {
    fun createJobPosition(jobPosition: JobPosition): JobPosition
}
