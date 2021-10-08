package tangle.benchmark.tangleLib0905

import androidx.fragment.app.Fragment
import tangle.fragment.ContributesFragment
import tangle.fragment.FragmentInject
import tangle.fragment.FragmentInjectFactory
import tangle.inject.TangleParam
import javax.inject.Inject

@ContributesFragment(Unit::class)
class TangleLib0905Fragment @Inject constructor() : Fragment()
