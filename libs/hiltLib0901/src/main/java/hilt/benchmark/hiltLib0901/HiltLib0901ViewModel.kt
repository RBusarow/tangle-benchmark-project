package hilt.benchmark.hiltLib0901

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HiltLib0901ViewModel @Inject constructor() : ViewModel()
