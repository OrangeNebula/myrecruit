package com.myrecruit.application.port.input

import com.myrecruit.domain.JobPosition

interface OpenPositionPort {
    fun openPosition(recruiterId: Int, jobPositionId: Int): JobPosition
}
