package com.example.nearby.data.model

data class Market(
    val id: String,
    val categoryId: String,
    val name: String,
    val description: String,
    val coupons: Int,
    val rules: List<Rule> = emptyList(),
    val lat: Double,
    val long: Double,
    val address: String,
    val phone: String,
    val cover: String,
)