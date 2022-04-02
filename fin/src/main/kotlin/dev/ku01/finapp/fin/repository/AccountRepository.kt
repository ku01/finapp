package dev.ku01.finapp.fin.repository

import dev.ku01.finapp.fin.entity.AccountEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : JpaRepository<AccountEntity, Long> {
    fun findByProjectId(projectId: Long): List<AccountEntity>
}