import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
 repositories {
   mavenLocal()
   mavenCentral()
   google()
   maven("https://plugins.gradle.org/m2/")
 }
 dependencies {
   classpath(libs.android.gradle)
   classpath(libs.kotlin.gradle.plug)
   classpath(libs.google.hilt.pluginGradle)
   classpath(libs.square.anvil.gradle)
   classpath("com.rickbusarow.tangle:tangle-gradle-plugin:0.14.0")
 }
}

allprojects {

 repositories {
   mavenLocal()
   mavenCentral()
   google()
   maven("https://plugins.gradle.org/m2/")
 }
  tasks.withType<KotlinCompile>()
    .configureEach {

      kotlinOptions {
        freeCompilerArgs = freeCompilerArgs + listOf(
          "-Xopt-in=kotlin.RequiresOptIn"
        )
      }
    }

}