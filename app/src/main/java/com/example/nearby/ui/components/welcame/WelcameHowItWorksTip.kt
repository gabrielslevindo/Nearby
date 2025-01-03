package com.example.nearby.ui.components.welcame

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nearby.R
import com.example.nearby.ui.theme.Gray500
import com.example.nearby.ui.theme.RedBase
import com.example.nearby.ui.theme.Typography

@Composable
fun WelcameHowItWorksTip(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
    @DrawableRes iconRes: Int
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Icon(
            modifier = Modifier.size(32.dp),
            painter = painterResource(id = iconRes),
            tint = RedBase,
            contentDescription = "icon how it works"
        )

        Spacer(modifier = Modifier.height(8.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = title,
                style = Typography.headlineSmall
            )
            Text(
                text = subtitle,
                color = Gray500,
                style = Typography.bodyLarge
            )
        }
    }
}

@Preview
@Composable
private fun WelcameHowItWorksTipPreview() {
    WelcameHowItWorksTip(
        modifier = Modifier.fillMaxWidth().background(Color.White),
        iconRes =  R.drawable.ic_map_pin,
        title = "Encontre Estabelecimentos",
        subtitle = "Veja locais perto de você que são parceiros Nearby"
    )
}