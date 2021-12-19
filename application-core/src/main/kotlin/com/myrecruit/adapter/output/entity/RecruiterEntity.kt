package com.myrecruit.adapter.output.entity

import javax.persistence.*

@Table(name = "recruiter_entity")
@Entity
open class RecruiterEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,

    val name: String,

    val description: String,
)
