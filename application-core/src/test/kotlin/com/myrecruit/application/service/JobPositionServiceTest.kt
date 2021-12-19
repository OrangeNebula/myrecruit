package com.myrecruit.application.service

import com.myrecruit.application.port.output.GetRecruiterPort
import com.myrecruit.application.port.output.SaveJobPositionPort
import io.kotest.core.spec.style.FunSpec
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.*

internal class JobPositionServiceTest : FunSpec({
    val getRecruiterPort: GetRecruiterPort = mockk()
    val saveJobPositionPort: SaveJobPositionPort = mockk()
    val jobPositionService: JobPositionService = JobPositionService(
        getRecruiterPort,
        saveJobPositionPort,
    )

    test("채용담당자 id 와, 새로 등록할 포지션 정보를 전달받아 신규 채용 포지션을 등록할 수 있다.") {
        every {

        }


    }
})
