package dev.ku01.finapp.fin.service

import dev.ku01.finapp.fin.converter.toDto
import dev.ku01.finapp.fin.converter.toEntity
import dev.ku01.finapp.fin.dto.CurrencyRateDto
import dev.ku01.finapp.fin.entity.CurrencyRateEntity
import dev.ku01.finapp.fin.repository.BankRepository
import dev.ku01.finapp.fin.repository.CurrencyRateRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CurrencyRateService(
    private val bankRepository: BankRepository
) : AbstractEntityService<CurrencyRateEntity, CurrencyRateRepository>() {

    @Transactional
    fun create(bankId: Long, currencyRateDto: CurrencyRateDto) {
        val bankEntity = bankRepository.findById(bankId).get()
        val currencyRateEntity = currencyRateDto.toEntity(bankEntity)
        repository.save(currencyRateEntity)
    }

    @Transactional(readOnly = true)
    fun getCurrencyRates(bankId: Long): List<CurrencyRateDto> {
        val bankEntity = bankRepository.findById(bankId).get()
        return repository.findByBankOrderByDateDesc(bankEntity).map { it.toDto() }
    }
}