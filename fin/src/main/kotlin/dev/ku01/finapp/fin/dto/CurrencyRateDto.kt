package dev.ku01.finapp.fin.dto

import dev.ku01.finapp.fin.enum.Currency
import java.math.BigDecimal
import java.time.LocalDate

data class CurrencyRateDto(
    val id: Long?,
    var bankId: Long,
    val date: LocalDate,
    val currencyFrom: Currency,
    val currencyTo: Currency,
    val value: BigDecimal
)