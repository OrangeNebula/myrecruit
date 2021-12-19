package com.myrecruit.application.port.input

import com.myrecruit.domain.JobPosition

interface RegisterNewJobPositionPort {
    fun registerNewJobPosition(
        recruiterId: Long,
        jobPositionName: String,
        jobPositionDescription: String,
    ): JobPosition
}
