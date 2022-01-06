package com.myrecruit.domain

data class JobPosition(
    val id: Long,
    val name: String,
    val description: String,
    val createRecruiterId: Long,
    var open: Boolean,
) {
    companion object {
        fun with(
            id: Long,
            name: String,
            description: String,
            createRecruiterId: Long,
            open: Boolean,
        ): JobPosition {
            return JobPosition(id, name, description, createRecruiterId, open);
        }
    }

    fun open() {
        this.open = true
    }

    fun close() {
        this.open = false
    }
}
