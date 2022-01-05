package com.myrecruit.domain

data class JobPosition(
    val id: Long,
    val name: String,
    val description: String,
    val createRecruiterId: Long,
    val open: Boolean,
) {
}
