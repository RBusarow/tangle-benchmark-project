plugins{
  id("com.android.library")
  kotlin("android")
  kotlin("kapt")
  id("com.rickbusarow.tangle")
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
  kapt(libs.google.dagger.compiler)

  api(libs.androidx.fragment.ktx)
  api(libs.androidx.lifecycle.viewModel.ktx)

  api(project(path = ":libs:tangleLib01"))
  api(project(path = ":libs:tangleLib02"))
  api(project(path = ":libs:tangleLib03"))
  api(project(path = ":libs:tangleLib04"))
  api(project(path = ":libs:tangleLib05"))
  api(project(path = ":libs:tangleLib06"))
  api(project(path = ":libs:tangleLib07"))
  api(project(path = ":libs:tangleLib08"))
  api(project(path = ":libs:tangleLib09"))
  api(project(path = ":libs:tangleLib10"))
}
