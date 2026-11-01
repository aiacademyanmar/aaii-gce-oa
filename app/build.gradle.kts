plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "asia.aaii.gcselanpya"
    compileSdk = 35
    defaultConfig {
        applicationId = "asia.aaii.gcselanpya"
        minSdk = 24
        targetSdk = 35
        versionCode = 290
        versionName = "2.9.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}
