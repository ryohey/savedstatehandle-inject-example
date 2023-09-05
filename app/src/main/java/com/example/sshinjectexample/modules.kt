package com.example.sshinjectexample
import com.example.sshinjectexample.ui.main.MainViewModel
import com.example.sshinjectexample.ui.result.ResultViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val myAppModules = module {
    viewModel { MainViewModel() }
    viewModel { ParentViewModel(get()) }
    viewModel { MainViewModel() }
    viewModel { ResultViewModel() }
}
