package com.myrecruit.application.port.output

import com.myrecruit.domain.JobPosition

interface FindJobPositionPort {
    fun findJobPositionById(jobPositionId: Long): JobPosition?
}
