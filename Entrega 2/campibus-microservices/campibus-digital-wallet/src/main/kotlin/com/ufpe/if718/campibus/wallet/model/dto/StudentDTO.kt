package com.ufpe.if718.campibus.wallet.model.dto

import java.util.*

data class StudentDTO(
    val id: UUID,
    val name: String? = null,
    val age: Int? = null,
    val school: String? = null,
    val course: String? = null,
    val busId: String? = null,
    val card: String? = null,
)

