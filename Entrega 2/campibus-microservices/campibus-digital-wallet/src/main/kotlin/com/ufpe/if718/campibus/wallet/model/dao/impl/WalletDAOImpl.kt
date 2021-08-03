package com.ufpe.if718.campibus.wallet.model.dao.impl

import com.ufpe.if718.campibus.wallet.model.dao.WalletDAO
import com.ufpe.if718.campibus.wallet.model.dao.repository.WalletRepository
import com.ufpe.if718.campibus.wallet.model.entities.Wallet
import org.springframework.stereotype.Component

@Component
class WalletDAOImpl(private val walletRepository: WalletRepository) : WalletDAO {

    override fun getWallet(wallet: Wallet): Wallet {
        TODO("Not yet implemented")
    }

}