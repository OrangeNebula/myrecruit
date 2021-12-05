package com.myrecruit.domain.model

data class ViewCount(val count: Int = 0) {
    operator fun plus(vc: ViewCount): ViewCount {
        return ViewCount(count + vc.count)
    }

    operator fun plus(value: Int): ViewCount {
        return ViewCount(count + value)
    }

    operator fun inc(): ViewCount {
        return ViewCount(count + 1)
    }

    fun reset(): ViewCount {
        return ViewCount(0)
    }
}
