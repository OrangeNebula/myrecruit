package com.myrecruit.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class RecruiterTest : FunSpec({
    test("포지션 명으로 백엔드 엔지니어, 설명 필드에 채용중이라는 값이 주어졌을 때, 리쿠르터는 채용포지션을 생성할 수 있다.") {
        val recruiter = Recruiter(0, "강지현")
        val jobPosition = recruiter.createJobPosition(0, "백엔드 엔지니어", "채용중")

        jobPosition.name shouldBe "백엔드 엔지니어"
        jobPosition.description shouldBe "채용중"
    }
})
