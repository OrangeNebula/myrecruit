package com.myrecruit.application.port.output

import com.myrecruit.domain.Recruiter

interface GetRecruiterPort {
    fun getRecruiterById(id: Long): Recruiter
}
