package com.ufpe.if718.campibus.wallet.model.dao.repository

import com.ufpe.if718.campibus.wallet.model.entities.Wallet
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface WalletRepository : JpaRepository<Wallet, UUID>