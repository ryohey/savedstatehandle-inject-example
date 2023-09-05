package com.example.sshinjectexample.ui.result

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class ResultViewModel : ViewModel() {
    val value = MutableStateFlow(0)
}
