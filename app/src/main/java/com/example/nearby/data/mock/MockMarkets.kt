package com.example.nearby.data.mock

import com.example.nearby.data.model.Category
import com.example.nearby.data.model.Market
import com.example.nearby.data.model.Rule

val mockCategories = listOf(
    Category(
        id = "1",
        name = "food"
    ),
    Category(
        id = "2",
        name = "shopping"
    ),
    Category(
        id = "3",
        name = "hosting"
    ),
    Category(
        id = "4",
        name = "supermarket"
    )
)

val mockMarkets = listOf(
    Market(
        id = "012576ea-4441-4b8a-89e5-d5f32104c7c4",
        categoryId = "146b1a88-b3d3-4232-8b8f-c1f006f1e86d",
        name = "Sabor Grill",
        description = "Churrascaria com Cortes nobres e buffet variado. Experiência completa para os amantes de carne. ",
        coupons = 10,
        rules = emptyList(),
        lat = -23.55974230991911,
        long = -46.65814845249887,
        address = "Av. Paulista - Bela Vista",
        phone = "(11) 94567-1212",
        cover = "https://images.unsplash.com/photo-1498654896293-37aacf113fd9?w=400&h=300"
    ),
    Market(
        id = "012576ea-4441-4b8a-89e5-d5f32104c7c4",
        categoryId = "146b1a88-b3d3-4232-8b8f-c1f006f1e86d",
        name = "Sabor Grill",
        description = "Churrascaria com Cortes nobres e buffet variado. Experiência completa para os amantes de carne. ",
        coupons = 10,
        rules = emptyList(),
        lat = -23.55974230991911,
        long = -46.65814845249887,
        address = "Av. Paulista - Bela Vista",
        phone = "(11) 94567-1212",
        cover = "https://images.unsplash.com/photo-1498654896293-37aacf113fd9?w=400&h=300"
    )
)

val mockRules = listOf(
    Rule(
        id = "12345",
        description = "Válido Apenas para consumo no local",
        marketId = "12345"
    ),
    Rule(
        id = "12345",
        description = "Disponível até 31/12/2024",
        marketId = "12345"
    ),
)