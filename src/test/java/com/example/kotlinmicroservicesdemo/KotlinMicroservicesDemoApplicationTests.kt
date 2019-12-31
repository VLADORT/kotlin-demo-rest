package com.example.kotlinmicroservicesdemo
import org.junit.Assert.assertThat
import org.junit.jupiter.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import kotlin.test.assertNotNull

class KotlinMicroservicesDemoApplicationTests {
    private lateinit var kotlinApp: KotlinMicroservicesDemoApplication

    @Test
    @DisplayName("Should return true when class app is initialized")
    fun shouldReturnTrueWhenAppClassInitialized() {
        assertNotNull(this.kotlinApp)
    }
}