package com.ufpe.if718.campibus.payment.model.integration

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping


@FeignClient(value = "payment", url = "http://localhost:3004/")
interface PaymentClient {
    @PostMapping("payment")
    fun makePayment(cardId: String)
}