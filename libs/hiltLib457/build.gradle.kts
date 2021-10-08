plugins{
  id("com.android.library")
  kotlin("android")
  kotlin("kapt")
  id("dagger.hilt.android.plugin")
}

kapt {
  correctErrorTypes = true
  useBuildCache = true
}

android {
  compileSdk = 31

  defaultConfig {
    minSdk = 21
    targetSdk = 31
  }
}

dependencies {
  kapt(libs.google.hilt.compiler)

  api(libs.google.hilt.library)
  api(libs.androidx.fragment.ktx)
  api(libs.androidx.lifecycle.viewModel.ktx)
}
