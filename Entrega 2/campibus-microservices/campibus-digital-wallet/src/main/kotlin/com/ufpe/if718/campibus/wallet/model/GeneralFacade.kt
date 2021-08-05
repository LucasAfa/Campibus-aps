package com.ufpe.if718.campibus.wallet.model

import com.ufpe.if718.campibus.wallet.model.entities.Wallet
import com.ufpe.if718.campibus.wallet.model.service.WalletService
import org.springframework.stereotype.Component

@Component
class GeneralFacade(
    private val walletService: WalletService
) {

    fun getWallet(studentId: String): Wallet {
        return walletService.getWallet(studentId)
    }

    fun generateWallet(content: String): Wallet {
        return walletService.generateWallet(content)
    }

}