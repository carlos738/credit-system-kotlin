package me.dio.credit.validation.system.repository

import me.dio.credit.validation.system.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository: JpaRepository<Customer,Long> {

}