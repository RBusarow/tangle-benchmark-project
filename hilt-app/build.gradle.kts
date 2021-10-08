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
  kapt(libs.androidx.hilt.compiler)

  api(libs.google.hilt.library)

  api(libs.androidx.fragment.ktx)
  api(libs.androidx.lifecycle.viewModel.ktx)

  api(project(path = ":libs:hiltLib01"))
  api(project(path = ":libs:hiltLib02"))
  api(project(path = ":libs:hiltLib03"))
  api(project(path = ":libs:hiltLib04"))
  api(project(path = ":libs:hiltLib05"))
  api(project(path = ":libs:hiltLib06"))
  api(project(path = ":libs:hiltLib07"))
  api(project(path = ":libs:hiltLib08"))
  api(project(path = ":libs:hiltLib09"))
  api(project(path = ":libs:hiltLib10"))
}
