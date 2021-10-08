package hilt.benchmark.hiltLib04

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HiltLib04ViewModel @Inject constructor() : ViewModel()
