package com.myrecruit.domain

class Recruiter(
    id: Long,
    name: String,
) {
    fun createJobPosition(
        id: Long,
        name: String,
        description: String,
    ): JobPosition {
        return JobPosition(id, name, description)
    }
}
