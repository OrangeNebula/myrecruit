package com.myrecruit.application.port.input

import com.myrecruit.domain.model.Application

interface GetApplicationPort {
    fun getApplication(applicationId: Int): Application
}
