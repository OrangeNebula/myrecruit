package com.myrecruit.domain.model

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class NameTest : FunSpec({

    test("강지현이라는 이름이 주어졌을 때, getMaskedName 를 호출하면 강o현이 리턴된다.") {
        val name = Name("강지현")
        name.getMaskedName() shouldBe "강o현"
    }

    test("한글자 이름이 주어졌을 때, getMaskedName 를 호출하면 o이 리턴된다. ") {
        val name = Name("강")
        name.getMaskedName() shouldBe "o"
    }
})
