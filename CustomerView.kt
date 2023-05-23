package me.dio.credit.validation.system.dto.response

import me.dio.credit.validation.system.entity.Customer
import java.math.BigDecimal

data class CustomerView(
    val firstNome: Customer,
    val lastName: String,
    val cpf: String,
    val income: BigDecimal,
    val email: String,
    val zipCode: String,
    val street: String,
    val id: Long?
)
