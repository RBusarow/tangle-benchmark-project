package hilt.benchmark.hiltLib0201

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HiltLib0201ViewModel @Inject constructor() : ViewModel()
