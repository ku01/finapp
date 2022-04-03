package dev.ku01.finapp.fin.entity

import javax.persistence.*

@Entity
@Table(name = "project")
class ProjectEntity(
    var name: String
) : BaseAuditEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_generator")
    @SequenceGenerator(name = "project_generator", sequenceName = "project_sequence", allocationSize = 1)
    var id: Long? = null
}