package com.example.nearby.ui.components.welcame

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nearby.R
import com.example.nearby.ui.theme.Typography

@Composable
fun WelcameContent(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(
            text = "Veja Como funciona:",
            style = Typography.bodyLarge
        )
        WelcameHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            iconRes =  R.drawable.ic_map_pin,
            title = "Encontre Estabelecimentos",
            subtitle = "Veja locais perto de você que são parceiros Nearby"
        )
        WelcameHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            iconRes =  R.drawable.ic_qrcode,
            title = "Ative o cupom com QR Code",
            subtitle = "Escaneie o código no estabelecimento para usar o benefício"
        )
        WelcameHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            iconRes =  R.drawable.ic_ticket,
            title = "Garanta vantagens perto de você",
            subtitle = "Ative cupons onde estiver, em diferentes tipos de estabelecimento "
        )
    }
}

@Preview
@Composable
private fun WelcameContentPreview() {
    WelcameContent(modifier = Modifier.background(Color.White))
}
