package dev.ku01.finapp.fin.repository

import dev.ku01.finapp.fin.entity.BankEntity
import org.springframework.data.jpa.repository.JpaRepository

interface BankRepository : JpaRepository<BankEntity, Long>