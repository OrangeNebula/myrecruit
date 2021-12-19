package com.myrecruit.domain

import com.myrecruit.domain.ViewCount
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ViewCountTest : FunSpec ({

    test("ViewCount 가 0 일 때, 30을 더하면 ViewCount 값은 30이 된다.") {
        var vc = ViewCount()
        vc += 30
        vc.count shouldBe 30
    }

    test("ViewCount 가 10 일 때, ++ 를 하면 ViewCount 값은 11이 된다.")  {
        var vc = ViewCount(10)
        vc++
        vc.count shouldBe 11
    }

})
