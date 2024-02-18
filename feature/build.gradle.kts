plugins {
  id("conventions.android")
}

android {
  namespace = "dev.serkanmercan.skeleton.feature"
}

dependencies {
  testImplementation(libs.square.turbine)
}
