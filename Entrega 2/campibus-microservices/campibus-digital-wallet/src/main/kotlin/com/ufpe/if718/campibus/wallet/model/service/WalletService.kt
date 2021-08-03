package com.ufpe.if718.campibus.wallet.model.service

import com.ufpe.if718.campibus.wallet.model.entities.Wallet

interface WalletService {
    fun getWallet(studentId: String): Wallet
}