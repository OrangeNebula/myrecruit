package com.myrecruit.application.service

import com.myrecruit.application.port.input.RegisterNewJobPositionPort
import com.myrecruit.domain.model.JobPosition

class RegisterNewJobPositionService : RegisterNewJobPositionPort {
    override fun registerNewJobPosition(jobPosition: JobPosition): JobPosition {
        TODO("Not yet implemented")
    }
}
