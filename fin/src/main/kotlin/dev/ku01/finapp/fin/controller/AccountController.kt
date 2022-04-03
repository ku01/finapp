package dev.ku01.finapp.fin.controller

import dev.ku01.finapp.fin.dto.AccountDto
import dev.ku01.finapp.fin.service.AccountService
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/project/{projectId}/account")
class AccountController(private val accountService: AccountService) {

    @PostMapping
    fun post(
        @PathVariable projectId: Long,
        @Validated @RequestBody accountDto: AccountDto
    ) {
        accountService.create(projectId, accountDto)
    }

    @GetMapping
    fun getAll(@PathVariable projectId: Long): List<AccountDto> {
        return accountService.getAll(projectId)
    }
}
