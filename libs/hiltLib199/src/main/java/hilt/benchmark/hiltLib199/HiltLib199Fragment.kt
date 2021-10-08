package hilt.benchmark.hiltLib199

import android.app.Application
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltLib199Fragment : Fragment() {
  // just need something to inject,
  // so that Hilt doesn't get to skip generating MemberInjectors
  @Inject lateinit var app: Application
}
