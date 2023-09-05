package com.example.sshinjectexample

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class ParentViewModel(private val savedStateHandle: SavedStateHandle): ViewModel() {
    val savedValue: Int
        get() = savedStateHandle.get<Int>("savedValue") ?: 0

    fun updateValue(value: Int) {
        savedStateHandle["savedValue"] = value
    }
}
