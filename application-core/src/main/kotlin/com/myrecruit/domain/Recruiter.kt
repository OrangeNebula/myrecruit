package com.myrecruit.domain

class Recruiter(
    val id: Long,
    val name: String,
) {
    fun createJobPosition(
        jobPositionId: Long,
        name: String,
        description: String,
    ): JobPosition {
        return JobPosition(jobPositionId, name, description, this.id)
    }
}
