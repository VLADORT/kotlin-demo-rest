package com.example.kotlinmicroservicesdemo
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class KotlinMicroservicesDemoApplication

fun main(args: Array<String>) {
        runApplication<KotlinMicroservicesDemoApplication>(*args)
        }