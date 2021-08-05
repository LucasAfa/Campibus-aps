package com.ufpe.if718.campibus.wallet.controllers

import com.ufpe.if718.campibus.wallet.model.GeneralFacade
import com.ufpe.if718.campibus.wallet.model.entities.Wallet
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/wallets")
class WalletController(private val generalFacade: GeneralFacade) {

    @GetMapping("{studentId}")
    fun getWallet(
        @PathVariable studentId: String
    ): Wallet {
        return generalFacade.getWallet(studentId)
    }

}