package com.example.composemovieapp.ui.theme

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable

@Composable
fun PreviewWithTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    ComposeMovieApp(darkTheme = darkTheme) {
        Surface() {
            content()
        }
    }
}