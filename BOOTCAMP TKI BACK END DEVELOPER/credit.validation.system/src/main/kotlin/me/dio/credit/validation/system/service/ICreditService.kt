package me.dio.credit.validation.system.service

import me.dio.credit.validation.system.entity.Credit
import me.dio.credit.validation.system.entity.Customer
import java.util.UUID

interface ICreditService {
    fun save(credit: Credit): Credit
    fun findAllByCustomer(customerId:Long): List<Credit>
    fun findByCreditCode(customerId: Long,creditCode: UUID): Credit
}