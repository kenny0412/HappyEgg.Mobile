package com.mobile.happyegg

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform