package dev.ku01.finapp.fin.repository

import dev.ku01.finapp.fin.entity.BankEntity
import dev.ku01.finapp.fin.entity.CurrencyRateEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CurrencyRateRepository : JpaRepository<CurrencyRateEntity, Long> {
    fun findByBankOrderByDateDesc(bankEntity: BankEntity): List<CurrencyRateEntity>
}