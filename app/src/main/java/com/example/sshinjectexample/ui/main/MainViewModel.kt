package com.example.sshinjectexample.ui.main

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class MainViewModel : ViewModel() {
    val value = MutableStateFlow(0)
}
