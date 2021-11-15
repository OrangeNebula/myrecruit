package com.myrecruit.application.port.input

interface GetApplicationUseCase {

    fun getById(query: GetByIdQuery): List<Number>

    data class GetByIdQuery(val id: Number) {
        init {
        }
    }

}
