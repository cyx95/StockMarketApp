package com.example.stockmarketapp.data.local

import androidx.room.PrimaryKey
import androidx.room.Entity

@Entity
data class CompanyListingEntity(
    val name: String,
    val symbol: String,
    val exchange: String,
    @PrimaryKey val id: Int? = null
)
