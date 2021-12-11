package com.myrecruit.application.port.output

import com.myrecruit.domain.model.Application

interface ReadApplicationPort {
    fun readApplication(applicationId: Int): Application
}
