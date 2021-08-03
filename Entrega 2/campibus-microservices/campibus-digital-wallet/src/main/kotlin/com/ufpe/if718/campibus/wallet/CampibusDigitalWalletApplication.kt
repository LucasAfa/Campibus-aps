package com.ufpe.if718.campibus.wallet

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class CampibusDigitalWalletApplication

fun main(args: Array<String>) {
    runApplication<CampibusDigitalWalletApplication>(*args)
}
