package dev.ku01.finapp.fin.service

import dev.ku01.finapp.fin.converter.toDto
import dev.ku01.finapp.fin.converter.toEntity
import dev.ku01.finapp.fin.dto.AccountDto
import dev.ku01.finapp.fin.entity.AccountEntity
import dev.ku01.finapp.fin.repository.AccountRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AccountService : AbstractEntityService<AccountEntity, AccountRepository>() {

    @Transactional
    fun create(projectId: Long, accountDto: AccountDto) {
        repository.save(accountDto.toEntity().apply {
            this.projectId = projectId
        })
    }

    @Transactional(readOnly = true)
    fun getAll(projectId: Long): List<AccountDto> {
        return repository.findByProjectId(projectId).map { it.toDto() }
    }
}