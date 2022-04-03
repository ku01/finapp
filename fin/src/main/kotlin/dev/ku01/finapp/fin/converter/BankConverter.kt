package dev.ku01.finapp.fin.converter

import dev.ku01.finapp.fin.dto.BankDto
import dev.ku01.finapp.fin.entity.BankEntity

fun BankDto.toEntity(): BankEntity {
    val id = id
    return BankEntity(
        name = name
    ).apply {
        this.id = id
    }
}

fun BankEntity.toDto() = BankDto(
    id = id,
    name = name
)