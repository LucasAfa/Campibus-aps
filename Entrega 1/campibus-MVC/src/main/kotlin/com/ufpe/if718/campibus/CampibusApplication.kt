package com.ufpe.if718.campibus

import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableFeignClients
@SpringBootApplication
class CampibusApplication

fun main(args: Array<String>) {
	runApplication<CampibusApplication>(*args)
}
