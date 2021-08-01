package com.ufpe.if718.campibus.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class CampibusCoreApplication

fun main(args: Array<String>) {
    runApplication<CampibusCoreApplication>(*args)
}
