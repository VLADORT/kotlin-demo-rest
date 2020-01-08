package com.example.kotlinmicroservicesdemo.controller

import com.example.kotlinmicroservicesdemo.domain.User
import com.example.kotlinmicroservicesdemo.repo.UserRepository
import org.slf4j.LoggerFactory.getLogger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class Controller {

    @Autowired
    lateinit var userRepository: UserRepository
    
    final val log = getLogger(javaClass)


    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): User? = userRepository.findById(id.toLong()).get()

    @GetMapping
    fun findAll(): List<User> = userRepository.findAll()

    @PostMapping
    fun add(@RequestBody user: User):User? {
        userRepository.save(user)
        log.info("Saved user ${user.id}")
        return user
    }

    @PutMapping
    fun update(@RequestBody person: User): User = userRepository.save(person)

    @DeleteMapping("/{id}")
    fun remove(@PathVariable id: Long): Boolean = userRepository.removeById(id)
}
