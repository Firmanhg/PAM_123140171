package com.firman.tugas1_123140171

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Tugas1_123140171",
    ) {
        App()
    }
}