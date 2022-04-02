package dev.ku01.finapp.fin.dto

import dev.ku01.finapp.fin.enum.Currency
import java.math.BigDecimal
import javax.validation.constraints.NotNull

data class AccountDto(
    val id: Long?,
    @get:NotNull
    val projectId: Long?,
    @get:NotNull
    val name: String?,
    val value: BigDecimal?,
    @get:NotNull
    val currency: Currency?
)