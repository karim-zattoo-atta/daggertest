import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("org.jetbrains.kotlin.kapt")

}

android {
    namespace = "com.example.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.8.1")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("com.google.dagger:dagger:2.44.2")
    kapt("com.google.dagger:dagger-compiler:2.44.2")
    implementation("com.google.dagger:dagger-android-support:2.44.2")
    kapt("com.google.dagger:dagger-android-processor:2.44.2")

    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")

    implementation ("androidx.fragment:fragment-ktx:1.6.2")
    // Sample usage: "by viewModels (fragment)" etc.
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.5")
    // Sample usage: "by viewModels (activity)" etc.
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.5")
    // Network
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Sample usage: KotlinJsonAdapterFactory
    implementation ("com.squareup.retrofit2:converter-moshi:2.9.0")

    // Dependencies for local unit tests
    testImplementation("junit:junit:4.13.2")
//    testImplementation "org.mockito:mockito-core:$mockitoVersion"
    testImplementation("io.mockk:mockk:1.12.3")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
//    testImplementation "androidx.arch.core:core-testing:$archTestingVersion"
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4")

    // Dependencies for Android unit tests
    androidTestImplementation ("junit:junit:4.13.2")

    // AndroidX Test - JVM testing
    // Sample usage: "InstrumentationRegistry"
    testImplementation("androidx.test:core-ktx:1.5.0")
    // Sample usage: "AndroidJUnit4"
    testImplementation("androidx.test.ext:junit-ktx:1.1.5")
    // Sample usage: AndroidJUnitRunner
    testImplementation("androidx.test:rules:1.5.0")

    // AndroidX Test - Instrumented testing
    // Sample usage: "InstrumentationRegistry"
    androidTestImplementation ("androidx.test:core-ktx:1.5.0")
    // Sample usage: "AndroidJUnit4"
    androidTestImplementation ("androidx.test.ext:junit-ktx:1.1.5")
    // Sample usage: AndroidJUnitRunner
    androidTestImplementation ("androidx.test:rules:1.5.0")

    // Using Dagger in androidTest and Robolectric too
    kaptTest ("com.google.dagger:dagger-compiler:2.44.2")
    kaptAndroidTest ("com.google.dagger:dagger-compiler:2.44.2")
}