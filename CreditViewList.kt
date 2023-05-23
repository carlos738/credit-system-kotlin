package me.dio.credit.validation.system.dto.response

import me.dio.credit.validation.system.entity.Credit
import java.math.BigDecimal
import java.util.UUID

data class CreditViewList(
    val creditCode:UUID,
    val creditValue: BigDecimal,
    val numberOfInstalments:Int,
){
    constructor(credit: Credit):this(
        creditCode = credit.creditCode,
        creditValue= credit.creditValue,
        numberOfInstalments = credit.numberOfInstallments
    )
}
