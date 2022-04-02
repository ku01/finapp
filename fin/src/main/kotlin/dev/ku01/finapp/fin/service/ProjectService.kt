package dev.ku01.finapp.fin.service

import dev.ku01.finapp.fin.converter.toDto
import dev.ku01.finapp.fin.converter.toEntity
import dev.ku01.finapp.fin.dto.ProjectDto
import dev.ku01.finapp.fin.entity.ProjectEntity
import dev.ku01.finapp.fin.repository.ProjectRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ProjectService : AbstractEntityService<ProjectEntity, ProjectRepository>() {

    @Transactional
    fun create(projectDto: ProjectDto) {
        repository.save(projectDto.toEntity())
    }

    @Transactional(readOnly = true)
    fun get(projectId: Long): ProjectDto {
        return repository.findById(projectId).get().toDto()
    }
}