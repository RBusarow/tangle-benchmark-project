package hilt.benchmark.hiltLib1000

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HiltLib1000ViewModel @Inject constructor() : ViewModel()
