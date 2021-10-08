package hilt.benchmark.hiltLib165

import android.app.Application
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltLib165Fragment : Fragment() {
  // just need something to inject,
  // so that Hilt doesn't get to skip generating MemberInjectors
  @Inject lateinit var app: Application
}
