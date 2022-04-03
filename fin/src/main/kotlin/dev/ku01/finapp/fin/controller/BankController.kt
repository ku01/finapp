package dev.ku01.finapp.fin.controller

import dev.ku01.finapp.fin.dto.BankDto
import dev.ku01.finapp.fin.service.BankService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/bank")
class BankController(private val bankService: BankService) {

    @PostMapping
    fun post(@RequestBody bankDto: BankDto) {
        bankService.create(bankDto)
    }

    @GetMapping
    fun getAll(): List<BankDto> {
        return bankService.getAll()
    }
}
