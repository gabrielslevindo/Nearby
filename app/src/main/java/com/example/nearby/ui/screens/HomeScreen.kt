package com.example.nearby.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nearby.data.mock.mockCategories
import com.example.nearby.data.mock.mockMarkets
import com.example.nearby.data.model.Market
import com.example.nearby.ui.components.category.NearCategoryFilterChipList
import com.example.nearby.ui.components.market.NearMarketCardList
import com.example.nearby.ui.theme.Gray100
import com.google.maps.android.compose.GoogleMap


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onNavigationToMarketDetails: (Market) -> Unit
) {

    val bottomSheetState = rememberBottomSheetScaffoldState()
    var isBottomSheetOpend by remember { mutableStateOf(true) }

    // Esse configuration pega os valores de todas as dimensões de celulares.
    val configuration = LocalConfiguration.current

    if (isBottomSheetOpend) {
        BottomSheetScaffold(
            modifier = modifier,
            scaffoldState = bottomSheetState,
            sheetContainerColor = Gray100,
            sheetPeekHeight = configuration.screenHeightDp.dp * 0.5f,
            sheetShape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
            sheetContent = {
                NearMarketCardList(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(all = 16.dp),
                    markets = mockMarkets,
                    onMarketClick = { selectedMarket ->
                        onNavigationToMarketDetails(selectedMarket)
                    }
                )
            },
            content = {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(it)
                ) {
                    GoogleMap(
                        modifier = Modifier.fillMaxSize(),
                    )

                    NearCategoryFilterChipList(
                        modifier =  Modifier.fillMaxWidth()
                            .padding(top = 24.dp)
                            .align(Alignment.TopStart),
                        categories = mockCategories,
                        onSelectedCategoryChanged = {}
                    )
                }
            }
        )
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen(
        onNavigationToMarketDetails = {}
    )
}


