package com.beetlejuice.beetlejuiceapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class BeetlejuiceApiApplication

fun main(args: Array<String>) {
	runApplication<BeetlejuiceApiApplication>(*args)
}

data class Message(val id: String?, val text: String)

@RestController
class MessageResource{
	@GetMapping("/")
	fun index(): List<Message> = listOf(
		Message("1", "hello"),
		Message("2", "bonjour")
	)
}
