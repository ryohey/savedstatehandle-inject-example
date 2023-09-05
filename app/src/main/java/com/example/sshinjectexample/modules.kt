package com.example.sshinjectexample
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val myAppModules = module {
    viewModel { MainViewModel(get()) }
}
