package dev.ku01.finapp.fin.entity

import dev.ku01.finapp.fin.enum.Currency
import java.math.BigDecimal
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "currency_rate")
class CurrencyRateEntity(
    @ManyToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    val bank: BankEntity,

    val date: LocalDate,

    @Enumerated(EnumType.STRING)
    val currencyFrom: Currency,

    @Enumerated(EnumType.STRING)
    val currencyTo: Currency,

    var value: BigDecimal
) {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "currency_rate_generator")
    @SequenceGenerator(name = "currency_rate_generator", sequenceName = "currency_rate_sequence", allocationSize = 1)
    var id: Long? = null
}