package hilt.benchmark.hiltLib02

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HiltLib02ViewModel @Inject constructor() : ViewModel()
