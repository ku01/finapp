package dev.ku01.finapp.fin.entity

import dev.ku01.finapp.fin.enum.Currency
import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "account")
class AccountEntity(
    var projectId: Long,
    var name: String,
    var value: BigDecimal,
    @Enumerated(EnumType.STRING)
    var currency: Currency
) {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_generator")
    @SequenceGenerator(name = "account_generator", sequenceName = "account_sequence", allocationSize = 1)
    var id: Long? = null
}