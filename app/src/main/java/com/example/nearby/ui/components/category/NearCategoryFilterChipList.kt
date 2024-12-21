package com.example.nearby.ui.components.category

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nearby.data.mock.mockCategories
import com.example.nearby.data.model.Category

@Composable
fun NearCategoryFilterChipList(
    modifier: Modifier = Modifier,
    categories: List<Category>,
    onSelectedCategoryChanged: (Category) -> Unit
) {

    var selectedCategoryId by remember { mutableStateOf(categories.firstOrNull()?.id.orEmpty()) }

    LaunchedEffect(key1 = selectedCategoryId) {
        val selectedCategoryOrNull = categories.find { it.id == selectedCategoryId }

        selectedCategoryOrNull?.let { category ->
            onSelectedCategoryChanged(category)
        }
    }

    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(items = categories, key = { it.id }) { category ->
            NearCategoryFilterChip(
                category = category,
                isSelected = category.id == selectedCategoryId,
                onClick = { isSelected ->
                    if (isSelected) selectedCategoryId = category.id
                }
            )
        }
    }
}

@Preview
@Composable
private fun NearCategoryFilterChipListPreview() {
    NearCategoryFilterChipList(
        modifier = Modifier.fillMaxWidth(),
        categories = mockCategories,
        onSelectedCategoryChanged = {}
    )
}