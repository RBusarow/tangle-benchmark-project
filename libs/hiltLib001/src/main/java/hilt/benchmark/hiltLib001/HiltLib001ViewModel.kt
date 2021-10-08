package hilt.benchmark.hiltLib001

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HiltLib001ViewModel @Inject constructor() : ViewModel()
