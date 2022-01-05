package com.myrecruit.application.service

import com.myrecruit.domain.JobPosition

fun getOpenJobPositionFixture(): JobPosition {
    return JobPosition(
        0,
        "채용 포지션",
        "채용 포지션 설명",
        0,
        true,
    )
}

fun getCloseJobPositionFixture(): JobPosition {
    return JobPosition(
        0,
        "채용 포지션",
        "채용 포지션 설명",
        0,
        false,
    )
}
