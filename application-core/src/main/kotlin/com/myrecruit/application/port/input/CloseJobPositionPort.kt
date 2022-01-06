package com.myrecruit.application.port.input

import com.myrecruit.domain.JobPosition

interface CloseJobPositionPort {
    fun closeJobPosition(recruiterId: Long, jobPositionId: Long): JobPosition
}
