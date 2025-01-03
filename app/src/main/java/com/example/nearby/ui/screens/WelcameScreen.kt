package com.example.nearby.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nearby.ui.components.button.NearButton
import com.example.nearby.ui.components.welcame.WelcameContent
import com.example.nearby.ui.components.welcame.WelcameHeader

@Composable
fun WelcameScreen(
    modifier: Modifier = Modifier,
    onNavigationToHome: () -> Unit
) {

    Column(
        modifier = modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(horizontal = 40.dp, vertical = 48.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        WelcameHeader()
        WelcameContent()
        NearButton(
            modifier = Modifier.fillMaxWidth(),
            text = "Começar",
            onClick = {
                onNavigationToHome()
            }
        )
    }
}

@Preview
@Composable
private fun WelcameScreenPreview() {
    WelcameScreen(
        onNavigationToHome = {}
    )
}