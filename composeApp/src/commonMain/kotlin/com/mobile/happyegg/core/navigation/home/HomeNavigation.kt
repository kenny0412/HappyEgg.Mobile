package com.mobile.happyegg.core.navigation.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import com.mobile.happyegg.core.navigation.Route
import kotlinx.serialization.Serializable

@Serializable
sealed class HomeNavigation : Route {
    open val name: String = ""

    /**
     * Base Route for [homeNavigationGraph].
     */
    @Serializable
    data object HomeRoute : Route

    @Serializable
    data object HomeSection : HomeNavigation() {
        override val name: String = "Home"
    }

    @Serializable
    data object ProfileSection : HomeNavigation() {
        override val name: String = "Profile"
    }

    @Serializable
    data object OrdersSection : HomeNavigation() {
        override val name: String = "Orders"
    }
}