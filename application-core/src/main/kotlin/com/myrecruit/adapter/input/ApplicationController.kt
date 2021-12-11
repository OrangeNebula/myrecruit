package com.myrecruit.adapter.input

import com.myrecruit.application.port.input.GetApplicationPort
import com.myrecruit.domain.model.Application

class ApplicationController : GetApplicationPort {
    override fun getApplication(applicationId: Int): Application {
        TODO("Not yet implemented")
    }
}
