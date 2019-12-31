package com.example.kotlinmicroservicesdemo.repo

import com.example.kotlinmicroservicesdemo.domain.User
import org.springframework.stereotype.Repository

@Repository
class UserRepository {
    val persons: MutableList<User> = ArrayList()
    fun findById(id: Int): User? {
        return persons.singleOrNull { it.id == id }
    }
    fun findAll(): List<User> {
        return persons
    }
    fun save(person: User): User {
        person.id = persons.size + 1
        persons.add(person)
        return person
    }
    fun update(person: User): User {
        val index = persons.indexOf(person)
        persons[index] = person
        return person
    }
    fun removeById(id: Int): Boolean {
        return persons.removeIf { it.id == id }
    }

}
