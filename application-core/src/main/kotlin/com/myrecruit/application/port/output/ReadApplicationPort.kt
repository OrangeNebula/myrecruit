package com.myrecruit.application.port.output

import com.myrecruit.domain.Application

interface ReadApplicationPort {
    fun readApplication(applicationId: Int): Application
}
