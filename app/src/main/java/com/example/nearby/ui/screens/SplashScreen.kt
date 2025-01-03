package com.example.nearby.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.nearby.R
import com.example.nearby.ui.theme.GreenLight
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds

@Composable
fun SplashScreen(modifier: Modifier = Modifier, onNavigationToWelcame: () -> Unit) {

    LaunchedEffect(key1 = Unit) {
        delay(3.seconds)
        onNavigationToWelcame()
    }

    Box(
        modifier = modifier
            .background(GreenLight)
            .fillMaxSize()
    ) {
        Image(
            modifier = Modifier.align(alignment = Alignment.Center),
            painter = painterResource(id = R.drawable.img_logo_logo_logo_text),
            contentDescription = "logo image"
        )
        Image(
            modifier = Modifier.align(alignment = Alignment.BottomCenter),
            painter = painterResource(id = R.drawable.bg_splash_screen),
            contentDescription = "background image"
        )
    }
}

@Preview
@Composable
private fun SplashScreenPreview() {
    SplashScreen(onNavigationToWelcame = {})
}