package com.myrecruit.application.port.input

import com.myrecruit.domain.model.JobPosition

interface RegisterNewJobPositionPort {
    fun registerNewJobPosition(jobPosition: JobPosition): JobPosition
}
