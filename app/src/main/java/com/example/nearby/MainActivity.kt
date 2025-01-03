package com.example.nearby

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.nearby.data.mock.mockMarkets
import com.example.nearby.data.model.Market
import com.example.nearby.ui.screens.HomeScreen
import com.example.nearby.ui.screens.MarketDetailsScreen
import com.example.nearby.ui.screens.Routes.Home
import com.example.nearby.ui.screens.Routes.Splash
import com.example.nearby.ui.screens.Routes.Welcame
import com.example.nearby.ui.screens.SplashScreen
import com.example.nearby.ui.screens.WelcameScreen
import com.example.nearby.ui.theme.NearbyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()

            NearbyTheme {
                NavHost(
                    navController = navController,
                    startDestination = Splash
                ) {
                    composable<Splash> {
                        SplashScreen(
                            modifier = Modifier.fillMaxSize(),
                            onNavigationToWelcame = {
                                navController.navigate(
                                    route = Welcame
                                )
                            }
                        )
                    }
                    composable<Welcame> {
                        WelcameScreen(
                            onNavigationToHome = {
                                navController.navigate(
                                    route = Home
                                )
                            }
                        )
                    }
                    composable<Home> {
                        HomeScreen(
                            onNavigationToMarketDetails = { selectedMarket ->
                                navController.navigate(
                                    route = selectedMarket
                                )
                            }
                        )
                    }
                    composable<Market> {
                        val selectedMarket = it.toRoute<Market>()
                        MarketDetailsScreen(
                            market = selectedMarket,
                            onNavigationHome = {
                                navController.navigate(
                                    route = Home
                                )
                            }
                        )
                    }

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NearbyTheme {
    }
}