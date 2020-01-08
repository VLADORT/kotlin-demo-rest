package com.example.kotlinmicroservicesdemo.domain

import lombok.*
import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long,
        @Column(nullable = false)
        var firstName: String,
        @Column(nullable = false)
        var lastName: String,
        @Column(nullable = false)
        var age: Int
)