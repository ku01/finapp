package dev.ku01.finapp.fin.controller

import dev.ku01.finapp.fin.dto.ProjectDto
import dev.ku01.finapp.fin.service.ProjectService
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/project")
class ProjectController(private val projectService: ProjectService) {

    @GetMapping("/{projectId}")
    fun get(@PathVariable projectId: Long): ProjectDto {
        return projectService.get(projectId)
    }

    @PostMapping
    fun post(@Validated @RequestBody projectDto: ProjectDto) {
        projectService.create(projectDto)
    }
}