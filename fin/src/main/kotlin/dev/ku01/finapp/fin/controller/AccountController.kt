package dev.ku01.finapp.fin.controller

import dev.ku01.finapp.fin.dto.AccountDto
import dev.ku01.finapp.fin.service.AccountService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/projects/{project}/accounts")
class AccountController(private val accountService: AccountService) {

    @GetMapping
    fun getAll(@PathVariable project: Long): List<AccountDto> {
        return accountService.getAll(project)
    }
}
