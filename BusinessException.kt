package me.dio.credit.validation.system.exception

data class BusinessException(override val message:String?): RuntimeException(message)
