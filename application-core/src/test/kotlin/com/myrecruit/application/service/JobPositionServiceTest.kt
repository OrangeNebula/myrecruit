package com.myrecruit.application.service

import com.myrecruit.application.port.output.GetRecruiterPort
import com.myrecruit.application.port.output.SaveJobPositionPort
import com.myrecruit.application.port.output.UpdateJobPositionPort
import com.myrecruit.domain.JobPosition
import com.myrecruit.domain.Recruiter
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.slot

internal class JobPositionServiceTest : FunSpec({
    val getRecruiterPort: GetRecruiterPort = mockk()
    val saveJobPositionPort: SaveJobPositionPort = mockk()
    val updateJobPositionPort: UpdateJobPositionPort = mockk()
    val jobPositionService: JobPositionService = JobPositionService(
        getRecruiterPort,
        saveJobPositionPort,
    )

    test("채용담당자 id 와, 새로 등록할 포지션 정보를 전달받아 신규 채용 포지션을 등록할 수 있다.") {
        every {
            getRecruiterPort.getRecruiterById(any())
        } answers {
            Recruiter(0, "채용담당자1")
        }

        val slot = slot<JobPosition>()
        every {
            saveJobPositionPort.saveJobPosition(capture(slot))
        } returnsArgument 0

        val jobPosition = jobPositionService.registerNewJobPosition(0, "백엔드", "채용")

        jobPosition.createRecruiterId shouldBe 0
        jobPosition.name shouldBe "백엔드"
        jobPosition.description shouldBe "채용"
    }

    test("채용담당자 id 와 포지션 id 를 전달받아, 포지션을 오픈할 수 있다.") {
        val slot = slot<JobPosition>()
        every {
            updateJobPositionPort.updateJobPosition(capture(slot))
        } returnsArgument 0

        val jobPosition = getCloseJobPositionFixture()

        jobPositionService.openJobPosition(jobPosition.createRecruiterId, jobPosition.id)

        jobPosition.open shouldBe true
    }

    test("채용담당자 id 와 포지션 id 를 전달받아, 포지션을 닫을 수 있다.") {
        val slot = slot<JobPosition>()
        every {
            updateJobPositionPort.updateJobPosition(capture(slot))
        } returnsArgument 0

        val jobPosition = getOpenJobPositionFixture()

        jobPositionService.closeJobPosition(jobPosition.createRecruiterId, jobPosition.id)

        jobPosition.open shouldBe false
    }
})
