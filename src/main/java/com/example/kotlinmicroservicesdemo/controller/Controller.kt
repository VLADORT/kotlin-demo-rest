package com.example.kotlinmicroservicesdemo.controller

import com.example.kotlinmicroservicesdemo.domain.User
import com.example.kotlinmicroservicesdemo.repo.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class Controller {
    @Autowired
    lateinit var repository: UserRepository

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): User? = repository.findById(id)

    @GetMapping
    fun findAll(): List<User> = repository.findAll()

    @PostMapping
    fun add(@RequestBody person: User): User = repository.save(person)

    @PutMapping
    fun update(@RequestBody person: User): User = repository.update(person)

    @DeleteMapping("/{id}")
    fun remove(@PathVariable id: Int): Boolean = repository.removeById(id)
}
