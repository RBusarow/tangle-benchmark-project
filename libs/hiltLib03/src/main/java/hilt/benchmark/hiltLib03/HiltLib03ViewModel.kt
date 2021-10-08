package hilt.benchmark.hiltLib03

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HiltLib03ViewModel @Inject constructor() : ViewModel()
