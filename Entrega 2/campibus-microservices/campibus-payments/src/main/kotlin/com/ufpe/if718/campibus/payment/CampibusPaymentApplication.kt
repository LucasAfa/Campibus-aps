package com.ufpe.if718.campibus.payment

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class CampibusPaymentApplication

fun main(args: Array<String>) {
    runApplication<CampibusPaymentApplication>(*args)
}
