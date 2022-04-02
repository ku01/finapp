package dev.ku01.finapp.fin.repository

import dev.ku01.finapp.fin.entity.ProjectEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<ProjectEntity, Long>