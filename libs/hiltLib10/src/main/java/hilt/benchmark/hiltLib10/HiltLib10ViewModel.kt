package hilt.benchmark.hiltLib10

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HiltLib10ViewModel @Inject constructor() : ViewModel()
