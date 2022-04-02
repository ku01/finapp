package dev.ku01.finapp.fin.converter

import dev.ku01.finapp.fin.dto.AccountDto
import dev.ku01.finapp.fin.entity.AccountEntity
import java.math.BigDecimal

fun AccountEntity.toDto() = AccountDto(
    id = id ?: error("id should be set"),
    projectId = projectId,
    name = name,
    value = value,
    currency = currency
)

fun AccountDto.toEntity(): AccountEntity {
    val id = id
    return AccountEntity(
        projectId = projectId ?: error("projectId should be set"),
        name = name ?: error("name should be set"),
        value = value ?: BigDecimal("0.0"),
        currency = currency ?: error("currency should be set")
    ).apply {
        this.id = id
    }
}