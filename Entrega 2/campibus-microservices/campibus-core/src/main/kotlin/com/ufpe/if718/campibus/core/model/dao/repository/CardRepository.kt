package com.ufpe.if718.campibus.core.model.dao.repository

import com.ufpe.if718.campibus.core.model.entities.Card
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CardRepository : JpaRepository<Card, UUID> {
}