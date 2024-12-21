package com.example.nearby.ui.components.category

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nearby.data.model.Category
import com.example.nearby.ui.theme.Gray300
import com.example.nearby.ui.theme.Gray400
import com.example.nearby.ui.theme.GreenBase
import com.example.nearby.ui.theme.Typography

@Composable
fun NearCategoryFilterChip(
    modifier: Modifier = Modifier,
    category: Category,
    isSelected: Boolean,
    onClick: (isSelected: Boolean) -> Unit
) {
    FilterChip(
        modifier = modifier
            .padding(all = 2.dp)
            .heightIn(min = 36.dp),
        elevation = FilterChipDefaults.filterChipElevation(
            elevation = 8.dp
        ),
        leadingIcon = {
            category.icon?.let {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = it),
                    tint = if (isSelected) Color.White else Gray400,
                    contentDescription = "Icon Filter Category"
                )
            }
        },
        border = FilterChipDefaults.filterChipBorder(
            enabled = false,
            selected = isSelected,
            disabledBorderColor = Gray300,
            borderWidth = 1.dp,
            selectedBorderWidth = 0.dp,
            selectedBorderColor = Color.Transparent
        ),
        colors = FilterChipDefaults.elevatedFilterChipColors(
            containerColor = Color.White,
            selectedContainerColor = GreenBase,
            labelColor = Gray400,
            selectedLabelColor = Color.White
        ),
        selected = isSelected,
        onClick = { onClick(!isSelected) },
        label = {
            Text(
                text = category.name,
                style = Typography.bodyMedium,
                color = if (isSelected) Color.White else Gray400
            )
        }
    )
}

@Preview
@Composable
private fun NearCategoryFilterChipSelectedPreview() {
    NearCategoryFilterChip(
        category = Category(
            id = "1",
            name = "food"
        ),
        isSelected = true,
        onClick = {}
    )
}

@Preview
@Composable
private fun NearCategoryFilterChipEnabledPreview() {
    NearCategoryFilterChip(
        category = Category(
            id = "1",
            name = "bakery"
        ),
        isSelected = false,
        onClick = {}
    )
}