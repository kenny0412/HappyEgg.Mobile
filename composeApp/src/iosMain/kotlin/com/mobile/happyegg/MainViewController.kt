package com.mobile.happyegg

import androidx.compose.ui.window.ComposeUIViewController
import com.mobile.happyegg.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }