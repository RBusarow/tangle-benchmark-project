package hilt.benchmark.hiltLib101

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HiltLib101ViewModel @Inject constructor() : ViewModel()
