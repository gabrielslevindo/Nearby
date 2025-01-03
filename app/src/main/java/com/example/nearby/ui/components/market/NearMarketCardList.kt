package com.example.nearby.ui.components.market

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nearby.data.mock.mockMarkets
import com.example.nearby.data.model.Market
import com.example.nearby.ui.theme.Typography

@Composable
fun NearMarketCardList(
    modifier: Modifier = Modifier, markets: List<Market>, onMarketClick: (Market) -> Unit
) {

    LazyColumn(
        modifier = modifier, verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ->
        item {
            Text(
                text = "Explore Locais perto de você", style = Typography.bodyLarge
            )
        }
        items(
            items = markets,
        ) { market ->
            NearMarketCard(
                market = market,
                onClick = {
                    onMarketClick(market)
                }
            )
        }


    }
}

@Preview
@Composable
private fun NearMarketCardListPreview () {
   NearMarketCardList(
       markets = mockMarkets,
       onMarketClick = { }
   )
}