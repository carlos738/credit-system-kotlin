package me.dio.credit.validation.system.service

import me.dio.credit.validation.system.entity.Customer

interface ICustomerService {
    fun save(customer: Customer): Customer
    fun findById(id: Long): Customer
    fun delete(id: Long)
}