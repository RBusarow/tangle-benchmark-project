package hilt.benchmark.hiltLib05

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HiltLib05ViewModel @Inject constructor() : ViewModel()
