plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("org.jetbrains.kotlin.kapt") // Ajout pour Room et KAPT
}

android {
    namespace = "com.example.gestiondesdonnees"
    compileSdk = 35 // Compatible avec les dépendances modernes

    defaultConfig {
        applicationId = "com.example.gestiondesdonnees"
        minSdk = 24 // Minimum supporté
        targetSdk = 35 // Version cible
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
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    // Core AndroidX
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)

    // Material Design
    implementation(libs.material)

    // Room Dependencies
    implementation("androidx.room:room-runtime:2.6.1") // Runtime de Room
    kapt("androidx.room:room-compiler:2.6.1") // Compiler Room avec KAPT
    implementation("androidx.room:room-ktx:2.6.1") // Extension KTX pour Room (Coroutines)

    // Lifecycle (ViewModel + LiveData)
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1") // ViewModel avec CoroutineScope
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1") // LiveData

    // Tests
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
