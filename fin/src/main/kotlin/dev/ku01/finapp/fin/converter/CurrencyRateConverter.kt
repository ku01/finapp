package dev.ku01.finapp.fin.converter

import dev.ku01.finapp.fin.dto.CurrencyRateDto
import dev.ku01.finapp.fin.entity.BankEntity
import dev.ku01.finapp.fin.entity.CurrencyRateEntity

fun CurrencyRateDto.toEntity(bankEntity: BankEntity): CurrencyRateEntity {
    val id = id
    return CurrencyRateEntity(
        bank = bankEntity,
        date = date,
        currencyFrom = currencyFrom,
        currencyTo = currencyTo,
        value = value
    ).apply {
        this.id = id
    }
}

fun CurrencyRateEntity.toDto() = CurrencyRateDto(
    id = id,
    bankId = bank.id ?: error("bankId should be set"),
    date = date,
    currencyFrom = currencyFrom,
    currencyTo = currencyTo,
    value = value
)