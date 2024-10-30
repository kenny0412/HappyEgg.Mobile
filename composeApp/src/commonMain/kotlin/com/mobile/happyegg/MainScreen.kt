package com.mobile.happyegg

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.mobile.happyegg.core.navigation.home.HomeNavigation
import com.mobile.happyegg.core.navigation.home.homeNavigationGraph

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = HomeNavigation.HomeRoute,
    ) {
        homeNavigationGraph(navController)
    }
}