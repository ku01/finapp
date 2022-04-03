package dev.ku01.finapp.fin.controller

import dev.ku01.finapp.fin.dto.CurrencyRateDto
import dev.ku01.finapp.fin.service.CurrencyRateService
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/bank/{bankId}/currency")
class CurrencyRateController(private val currencyRateService: CurrencyRateService) {

    @PostMapping
    fun postCurrencyRate(
        @PathVariable bankId: Long,
        @Validated @RequestBody currencyRate: CurrencyRateDto
    ) {
        currencyRateService.create(bankId, currencyRate)
    }

    @GetMapping
    fun getCurrencyRates(@PathVariable bankId: Long): List<CurrencyRateDto> {
        return currencyRateService.getCurrencyRates(bankId)
    }
}