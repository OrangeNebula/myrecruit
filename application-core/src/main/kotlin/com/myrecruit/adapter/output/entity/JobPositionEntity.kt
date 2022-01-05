package com.myrecruit.adapter.output.entity

import javax.persistence.*

@Table(name = "job_position_entity")
@Entity
open class JobPositionEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,

    val name: String,

    val description: String,

    val createRecruiterId: Long,

    val open: Boolean,
)
