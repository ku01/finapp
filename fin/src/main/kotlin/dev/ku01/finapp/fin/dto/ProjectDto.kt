package dev.ku01.finapp.fin.dto

import javax.validation.constraints.NotNull

data class ProjectDto(
    val id: Long?,
    @get:NotNull
    val name: String?
)