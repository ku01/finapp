package dev.ku01.finapp.fin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication(scanBasePackages = ["dev.ku01.finapp.fin"])
@EnableJpaAuditing
class FinappApplication

fun main(args: Array<String>) {
    runApplication<FinappApplication>(*args)
}