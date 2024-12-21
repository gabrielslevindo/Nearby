package com.example.nearby.ui.components.market_details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nearby.R
import com.example.nearby.data.mock.mockMarkets
import com.example.nearby.data.model.Market
import com.example.nearby.ui.theme.Gray400
import com.example.nearby.ui.theme.Gray500
import com.example.nearby.ui.theme.Typography


@Composable
fun MarketDetailsInfo(modifier: Modifier = Modifier, market: Market) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Informações",
            style = Typography.headlineSmall,
            color = Gray400
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(R.drawable.ic_ticket),
                    tint = Gray500,
                    contentDescription = "Icon Coupons"
                )
                Text(
                    text = "${market.coupons} Cupons Disponíveis",
                    style = Typography.labelMedium,
                    color = Gray500
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(R.drawable.ic_map_pin),
                    tint = Gray500,
                    contentDescription = "Icon Map"
                )
                Text(
                    text = market.address,
                    style = Typography.labelMedium,
                    color = Gray500
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(R.drawable.ic_phone),
                    tint = Gray500,
                    contentDescription = "Icon Phone"
                )
                Text(
                    text = market.phone,
                    style = Typography.labelMedium,
                    color = Gray500
                )
            }
        }
    }
}

@Preview
@Composable
private fun MarketDetailsInfoPreview() {
    MarketDetailsInfo(
        modifier = Modifier.fillMaxWidth(),
        market = mockMarkets.first()
    )
}