import org.jetbrains.kotlin.gradle.model.Kapt

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    kotlin("kapt")
}

android {
    namespace = "myst.mostafayellowstone.jokesapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "myst.mostafayellowstone.jokesapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        buildFeatures{
            dataBinding = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    val lifecycle_version = "2.8.5"
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // activity & view model lifecycle
    implementation("androidx.activity:activity-ktx:1.9.2")
    // Retrofit dependency
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    // Gson Converter for retrofit
    implementation("com.google.code.gson:gson:2.8.9")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    // ViewModel Implementations
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    // annotation processor
    kapt("androidx.lifecycle:lifecycle-compiler:$lifecycle_version")
    // coroutines dependency
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")
    // logging interceptor
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.1")






}