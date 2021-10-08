package hilt.benchmark.hiltLib250

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HiltLib250ViewModel @Inject constructor() : ViewModel()
