package com.myrecruit.application.port.input

import com.myrecruit.domain.JobPosition

interface ClosePositionPort {
    fun closePosition(recruiterId: Int, jobPositionId: Int): JobPosition
}
