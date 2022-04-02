package dev.ku01.finapp.fin.converter

import dev.ku01.finapp.fin.dto.ProjectDto
import dev.ku01.finapp.fin.entity.ProjectEntity

fun ProjectEntity.toDto() = ProjectDto(
    id = id,
    name = name
)

fun ProjectDto.toEntity(): ProjectEntity {
    val id = id
    return ProjectEntity(
        name = name ?: error("name should be set")
    ).apply {
        this.id = id
    }
}