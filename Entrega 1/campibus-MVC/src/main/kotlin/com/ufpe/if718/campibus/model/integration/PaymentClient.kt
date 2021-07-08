package com.ufpe.if718.campibus.model.integration

import com.ufpe.if718.campibus.model.entities.Card
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.*


@FeignClient(value = "payment", url = "http://localhost:3004/")
interface PaymentClient {
    @PostMapping("payment")
    fun makePayment(card: Card)
}