package com.ufpe.if718.campibus.core.model.dao.repository

import com.ufpe.if718.campibus.core.model.entities.Card
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CardRepository : JpaRepository<Card, UUID>{
    @Query(value = "SELECT c FROM Card c WHERE c.id = id ")
    fun getAllByStudentId(id: UUID): List<Card>
}