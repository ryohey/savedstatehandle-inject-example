package com.example.sshinjectexample.ui.result

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.navigation.fragment.NavHostFragment
import com.example.sshinjectexample.ParentViewModel
import com.example.sshinjectexample.R
import com.example.sshinjectexample.ui.theme.SSHInjectExampleTheme
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ResultFragment : Fragment() {
    private val parentViewModel: ParentViewModel by activityViewModel()
    private val viewModel: ResultViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val navHostFragment = requireActivity().supportFragmentManager.findFragmentById(R.id.main_nav_host) as NavHostFragment
        val navController = navHostFragment.navController
        return ComposeView(inflater.context).apply {
            setContent {
                val count = viewModel.value.collectAsState()
                SSHInjectExampleTheme {
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        Column {
                            Text(text = "Count ${count.value}")
                            Button(onClick = {
                                navController.navigateUp()
                            }) {
                                Text(text = "Back")
                            }
                        }
                    }
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.value.value = parentViewModel.savedValue
    }
}
