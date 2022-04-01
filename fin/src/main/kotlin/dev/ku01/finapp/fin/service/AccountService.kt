package dev.ku01.finapp.fin.service

import dev.ku01.finapp.fin.dto.AccountDto
import dev.ku01.finapp.fin.enum.Currency
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class AccountService {

    fun getAll(project: Long): List<AccountDto> {
        return listOf(AccountDto(
            id = 1,
            name = "Cash",
            value = BigDecimal("100.0"),
            currency = Currency.USD
        ), AccountDto(
            id = 2,
            name = "Bank",
            value = BigDecimal("1207.41"),
            currency = Currency.USD
        ))
    }
}
