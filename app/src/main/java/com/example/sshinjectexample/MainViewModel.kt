package com.example.sshinjectexample

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel(private val savedStateHandle: SavedStateHandle): ViewModel() {
    val savedValue = savedStateHandle.get<Int>("savedValue")

    fun updateValue(value: Int) {
        savedStateHandle["savedValue"] = value
    }
}
