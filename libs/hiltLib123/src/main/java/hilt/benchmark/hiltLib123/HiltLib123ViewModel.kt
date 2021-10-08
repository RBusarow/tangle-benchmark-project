package hilt.benchmark.hiltLib123

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HiltLib123ViewModel @Inject constructor() : ViewModel()
