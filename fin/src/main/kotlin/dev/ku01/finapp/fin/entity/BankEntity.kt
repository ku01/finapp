package dev.ku01.finapp.fin.entity

import javax.persistence.*

@Entity
@Table(name = "bank")
class BankEntity(
    var name: String
) : BaseAuditEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bank_generator")
    @SequenceGenerator(name = "bank_generator", sequenceName = "bank_sequence", allocationSize = 1)
    var id: Long? = null
}