package com.ufpe.if718.campibus.wallet.model.dao.impl

import com.ufpe.if718.campibus.wallet.model.dao.WalletDAO
import com.ufpe.if718.campibus.wallet.model.dao.repository.WalletRepository
import com.ufpe.if718.campibus.wallet.model.entities.Wallet
import org.springframework.stereotype.Component
import java.util.*

@Component
class WalletDAOImpl(private val walletRepository: WalletRepository) : WalletDAO {

    override fun getWallet(studentId: String): Wallet {
        val id = UUID.fromString(studentId)
        return walletRepository.getById(id)
    }

    override fun generateWallet(wallet: Wallet): Wallet {
        return walletRepository.save(wallet)
    }

}