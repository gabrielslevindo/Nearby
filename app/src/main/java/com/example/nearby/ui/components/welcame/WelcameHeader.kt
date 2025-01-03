package com.example.nearby.ui.components.welcame

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nearby.R
import com.example.nearby.ui.theme.Typography

@Composable
fun WelcameHeader(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.img_logo_logo_icon),
            contentDescription = "logo image"
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Boas Vindas ao NearBy",
            style = Typography.headlineLarge
        )
        Text(
            text = "Tenha cupons de vantagem para utilizar nos seus estabelecimentos favoritos.",
            style = Typography.bodyLarge
        )
    }
}

@Preview
@Composable
private fun WelcameHeaderPreview() {
    WelcameHeader(modifier = Modifier.background(Color.White))
}