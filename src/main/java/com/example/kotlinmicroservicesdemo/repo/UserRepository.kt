package com.example.kotlinmicroservicesdemo.repo

import com.example.kotlinmicroservicesdemo.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import java.util.*

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun removeById(id: Long): Boolean
}
