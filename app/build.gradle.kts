plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.linebet"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.linebet"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes += "AndroidManifest.xml"
            excludes += "lib/arm64-v8a/libcardioDecider.so"
            excludes += "lib/arm64-v8a/libcardioRecognizer.so"
            excludes += "lib/arm64-v8a/libcardioRecognizer_tegra2.so"
            excludes += "lib/arm64-v8a/libopencv_core.so"
            excludes += "lib/arm64-v8a/libopencv_imgproc.so"
            excludes += "lib/armeabi/libcardioDecider.so"
            excludes += "lib/armeabi-v7a/libcardioDecider.so"
            excludes += "lib/armeabi-v7a/libcardioRecognizer.so"
            excludes += "lib/armeabi-v7a/libcardioRecognizer_tegra2.so"
            excludes += "lib/armeabi-v7a/libopencv_core.so"
            excludes += "lib/armeabi-v7a/libopencv_imgproc.so"
            excludes += "lib/mips/libcardioDecider.so"
            excludes += "lib/x86/libcardioDecider.so"
            excludes += "lib/x86/libcardioRecognizer.so"
            excludes += "lib/x86/libcardioRecognizer_tegra2.so"
            excludes += "lib/x86/libopencv_core.so"
            excludes += "lib/x86/libopencv_imgproc.so"
            excludes += "lib/x86_64/libcardioDecider.so"
            excludes += "lib/x86_64/libcardioRecognizer.so"
            excludes += "lib/x86_64/libcardioRecognizer_tegra2.so"
            excludes += "lib/x86_64/libopencv_core.so"
            excludes += "lib/x86_64/libopencv_imgproc.so"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}