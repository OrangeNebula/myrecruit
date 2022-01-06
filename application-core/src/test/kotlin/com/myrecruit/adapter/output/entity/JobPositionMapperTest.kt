package com.myrecruit.adapter.output.entity

import com.myrecruit.application.service.getOpenJobPositionFixture
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

internal class JobPositionMapperTest : FunSpec({
    val mapper: JobPositionMapper = JobPositionMapper()

    test("JobPosition 도메인 엔티티가 주어졌을 때, Jpa 엔티티로 맵핑 시킬 수 있다.") {
        val fixture = getOpenJobPositionFixture()
        val jobPositionJpaEntity = mapper.toJpaEntity(fixture)

        jobPositionJpaEntity.id shouldBe fixture.id
    }

    test("JobPosition Jpa 엔티티가 주어졌을 때, 도메인 엔티티로 맵핑 시킬 수 있다.") {
        val fixture = getJobPositionJpaEntityFixture()
        val domainEntity = mapper.toDomainEntity(fixture)

        domainEntity.id shouldBe fixture.id
    }
})
