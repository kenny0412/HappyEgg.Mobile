package com.mobile.happyegg.core.navigation.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.mobile.happyegg.features.home.HomeScreen

fun NavGraphBuilder.homeNavigationGraph(parentNavController: NavController) {
    navigation<HomeNavigation.HomeRoute>(
        startDestination = HomeNavigation.HomeSection,
    ) {
        composable<HomeNavigation.HomeSection> {
            HomeScreen()
        }
        composable<HomeNavigation.ProfileSection> {
//            ProfileScreen()
        }
        composable<HomeNavigation.OrdersSection> {
//            OrdersScreen()
        }
    }
}