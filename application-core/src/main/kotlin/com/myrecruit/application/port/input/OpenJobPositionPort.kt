package com.myrecruit.application.port.input

import com.myrecruit.domain.JobPosition

interface OpenJobPositionPort {
    fun openJobPosition(recruiterId: Long, jobPositionId: Long): JobPosition
}
