package dev.ku01.finapp.fin.dto

import dev.ku01.finapp.fin.enum.Currency
import java.math.BigDecimal

data class AccountDto(
    val id: Long,
    val name: String,
    val value: BigDecimal,
    val currency: Currency
)
