package com.myrecruit.application.service

import com.myrecruit.application.port.input.GetApplicationPort
import com.myrecruit.domain.model.Application

class GetApplicationService : GetApplicationPort {
    override fun getApplication(applicationId: Int): Application {
        TODO("Not yet implemented")
    }
}
