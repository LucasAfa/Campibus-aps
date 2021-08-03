package com.ufpe.if718.campibus.wallet.model.dao

import com.ufpe.if718.campibus.wallet.model.entities.Wallet

interface WalletDAO {
    fun getWallet(wallet: Wallet): Wallet
}