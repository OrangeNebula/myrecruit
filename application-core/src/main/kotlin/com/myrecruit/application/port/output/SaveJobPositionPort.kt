package com.myrecruit.application.port.output

import com.myrecruit.domain.JobPosition

interface SaveJobPositionPort {
    fun saveJobPosition(jobPosition: JobPosition): JobPosition
}
