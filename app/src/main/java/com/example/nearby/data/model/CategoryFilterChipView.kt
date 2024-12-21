package com.example.nearby.data.model

import androidx.annotation.DrawableRes
import com.example.nearby.R

enum class CategoryFilterChipView(
    val description: String,
    @DrawableRes val icon: Int
) {
    FOOD(description = "food", icon = R.drawable.ic_tools_kitchen_2),
    SHOPPING(description = "shopping", icon = R.drawable.ic_shopping_bag),
    HOSTING(description = "hosting", icon = R.drawable.ic_bed),
    SUPERMARKET(description = "supermarket", icon = R.drawable.ic_shopping_cart),
    ENTERTAINMENT(description = "entertainment", icon = R.drawable.ic_movie),
    PHARMACY(description = "pharmacy", icon = R.drawable.ic_first_aid_kit),
    FUEL(description = "fuel", icon = R.drawable.ic_gas_station),
    BAKERY(description = "bakery", icon = R.drawable.ic_bakery);

    companion object {
        fun fromDescription(description: String): CategoryFilterChipView? {
            return entries.find { it.description == description }
        }
    }
}
