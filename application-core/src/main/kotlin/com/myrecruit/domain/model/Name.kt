package com.myrecruit.domain.model

import java.util.*

class Name(
    private val name: String,
) {
    fun getMaskedName(): String {
        val buf = name.toCharArray()
        val index = if (buf.size > 1) 1 else 0
        buf[index] = 'o'
        return String(buf)
    }
}
