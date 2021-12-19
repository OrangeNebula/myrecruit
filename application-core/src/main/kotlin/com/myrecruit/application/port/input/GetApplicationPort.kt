package com.myrecruit.application.port.input

import com.myrecruit.domain.Application

interface GetApplicationPort {
    fun getApplication(applicationId: Int): Application
}
