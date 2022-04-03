package dev.ku01.finapp.fin.service

import dev.ku01.finapp.fin.converter.toDto
import dev.ku01.finapp.fin.converter.toEntity
import dev.ku01.finapp.fin.dto.BankDto
import dev.ku01.finapp.fin.entity.BankEntity
import dev.ku01.finapp.fin.repository.BankRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class BankService : AbstractEntityService<BankEntity, BankRepository>() {

    @Transactional
    fun create(bankDto: BankDto) {
        repository.save(bankDto.toEntity())
    }

    @Transactional(readOnly = true)
    fun getAll(): List<BankDto> {
        return repository.findAll().map { it.toDto() }
    }

    @Transactional(readOnly = true)
    fun getById(id: Long): BankDto {
        return repository.getById(id).toDto()
    }
}