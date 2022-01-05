package com.myrecruit.application.port.output

import com.myrecruit.domain.JobPosition

interface UpdateJobPositionPort {
    fun updateJobPosition(jobPosition: JobPosition): JobPosition
}
