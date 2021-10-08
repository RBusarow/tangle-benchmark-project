plugins{
  id("com.android.library")
  kotlin("android")
  id("com.rickbusarow.tangle")
}

anvil {
  generateDaggerFactories.set(true)
}

tangle {
  fragmentsEnabled = true
  workEnabled = true
}

android {
  compileSdk = 31

  defaultConfig {
    minSdk = 21
    targetSdk = 31
  }
}

dependencies {
  api(libs.androidx.fragment.ktx)
  api(libs.androidx.lifecycle.viewModel.ktx)
}
