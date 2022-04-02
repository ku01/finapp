package dev.ku01.finapp.fin.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.JpaRepository

abstract class AbstractEntityService<T, U : JpaRepository<T, Long>> {
    @Autowired
    protected lateinit var repository: U
}
