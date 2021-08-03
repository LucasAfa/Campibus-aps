package com.ufpe.if718.campibus.wallet.model.integration

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping


@FeignClient(value = "travel", url = "http://localhost:3004/")
interface travelClient {
    @PostMapping("travel")
    fun maketravel(cardId: String)
}