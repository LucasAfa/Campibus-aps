package com.ufpe.if718.campibus.wallet.model.service.impl

import com.ufpe.if718.campibus.wallet.model.dao.WalletDAO
import com.ufpe.if718.campibus.wallet.model.entities.Wallet
import com.ufpe.if718.campibus.wallet.model.service.WalletService
import org.springframework.stereotype.Service

@Service
class WalletServiceImpl(private val walletDAO: WalletDAO) : WalletService {

    override fun getWallet(studentId: String): Wallet {
        TODO("Not yet implemented")
    }

}