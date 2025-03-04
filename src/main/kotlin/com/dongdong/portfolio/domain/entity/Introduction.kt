package com.dongdong.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Introduction(
    content: String,
    isActive: Boolean

) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "introduction_id")
    var id: Long? = null //자료형 뒤에 ?물음표가 붙으면 null이 허용된다는 뜻이다.

    var content: String = content

    var isActive: Boolean = isActive
}