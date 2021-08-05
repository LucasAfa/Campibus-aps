package com.ufpe.if718.campibus.wallet.model.service.impl

import com.fasterxml.jackson.databind.ObjectMapper
import com.ufpe.if718.campibus.wallet.model.dao.WalletDAO
import com.ufpe.if718.campibus.wallet.model.entities.Wallet
import com.ufpe.if718.campibus.wallet.model.service.WalletService
import org.springframework.stereotype.Service

@Service
class WalletServiceImpl(private val walletDAO: WalletDAO, private val mapper: ObjectMapper) : WalletService {

    override fun getWallet(studentId: String): Wallet {
        return walletDAO.getWallet(studentId)
    }

    override fun generateWallet(content: String): Wallet {
        val wallet = mapper.readValue(content, Wallet::class.java)
        return walletDAO.generateWallet(wallet)
    }

}