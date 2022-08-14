package com.kyungeun.composesamples.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    surface = Color.Blue,
    onSurface = Color.DarkGray,
    primary = Color.LightGray,
    onPrimary = Color.DarkGray
)

private val LightColorPalette = lightColors(
    surface = Color.Blue,
    onSurface = Color.White,
    primary = Color.LightGray,
    onPrimary = Color.DarkGray
)

@Composable
fun ComposeSamplesTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}