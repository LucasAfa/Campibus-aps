package com.ufpe.if718.campibus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CampibusApplication

fun main(args: Array<String>) {
	runApplication<CampibusApplication>(*args)
}
