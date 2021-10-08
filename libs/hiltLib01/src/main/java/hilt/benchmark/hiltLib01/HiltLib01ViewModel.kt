package hilt.benchmark.hiltLib01

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HiltLib01ViewModel @Inject constructor() : ViewModel()
