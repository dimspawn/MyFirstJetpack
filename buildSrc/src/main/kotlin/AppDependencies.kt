object AppDependencies {
    //SharedDependencies
    const val APPCOMPAT = "androidx.appcompat:appcompat:${BuildDependencyVersions.APPCOMPAT_VERSION}"
    const val CORE_KTX = "androidx.core:core-ktx:${BuildDependencyVersions.CORE_KTX_VERSION}"

    const val JUNIT = "junit:junit:${BuildDependencyVersions.JUNIT_VERSION}"
    const val TEST_EXT_JUNIT = "androidx.test.ext:junit:${BuildDependencyVersions.TEST_EXT_JUNIT_VERSION}"
    const val TEST_ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${BuildDependencyVersions.TEST_ESPRESSO_CORE_VERSION}"

    const val GLIDE = "com.github.bumptech.glide:glide:${BuildDependencyVersions.GLIDE_VERSION}"

    const val DAGGER = "com.google.dagger:dagger:${BuildDependencyVersions.DAGGER_VERSION}"
    const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:${BuildDependencyVersions.DAGGER_VERSION}"

    const val SHIMMER = "com.facebook.shimmer:shimmer:${BuildDependencyVersions.SHIMMER_VERSION}"

    const val LOTTIE = "com.airbnb.android:lottie:${BuildDependencyVersions.LOTTIE_VERSION}"

    const val ACTIVITY_KTX = "androidx.activity:activity-ktx:${BuildDependencyVersions.ACTIVITY_KTX_VERSION}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${BuildDependencyVersions.FRAGMENT_KTX_VERSION}"

    //AppDependencies
    const val LIFECYCLE_RUNTIME = "androidx.lifecycle:lifecycle-runtime-ktx:${BuildDependencyVersions.ANDROID_LIFECYCLE_VERSION}"
    const val ACTIVITY_COMPOSE_KTX = "androidx.activity:activity-compose:${BuildDependencyVersions.ACTIVITY_KTX_VERSION}"
    const val COMPOSE_BOM = "androidx.compose:compose-bom:2023.08.00"
    const val COMPOSE_UI = "androidx.compose.ui:ui:${BuildDependencyVersions.COMPOSE_UI_VERSION}"
    const val COMPOSE_UI_GRAPHIC = "androidx.compose.ui:ui-graphics:${BuildDependencyVersions.COMPOSE_UI_VERSION}"
    const val COMPOSE_UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview:${BuildDependencyVersions.COMPOSE_UI_VERSION}"
    const val MATERIAL3 = "androidx.compose.material3:material3:${BuildDependencyVersions.MATERIAL3_VERSION}"
    const val UI_TEST_JUNIT = "androidx.compose.ui:ui-test-junit4:${BuildDependencyVersions.COMPOSE_UI_VERSION}"
    const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling:${BuildDependencyVersions.COMPOSE_UI_VERSION}"
    const val COMPOSE_UI_TEST_MANIFEST = "androidx.compose.ui:ui-test-manifest:${BuildDependencyVersions.COMPOSE_UI_VERSION}"

    //CoreDependencies
    const val MATERIAL = "com.google.android.material:material:${BuildDependencyVersions.MATERIAL_VERSION}"

    const val ROOM_RUNTIME = "androidx.room:room-runtime:${BuildDependencyVersions.ROOM_VERSION}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${BuildDependencyVersions.ROOM_VERSION}"
    const val ROOM_KTX = "androidx.room:room-ktx:${BuildDependencyVersions.ROOM_VERSION}"
    const val ROOM_TESTING = "androidx.room:room-testing:${BuildDependencyVersions.ROOM_VERSION}"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:${BuildDependencyVersions.RETROFIT_VERSION}"
    const val RETROFIT_GSON = "com.squareup.retrofit2:converter-gson:${BuildDependencyVersions.RETROFIT_VERSION}"
    const val OKHTTP3 = "com.squareup.okhttp3:logging-interceptor:${BuildDependencyVersions.OKHTTP3_VERSION}"

    const val COROUTINE_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${BuildDependencyVersions.COROUTINES_VERSION}"
    const val COROUTINE_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${BuildDependencyVersions.COROUTINES_VERSION}"
    const val LIFECYCLE_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:${BuildDependencyVersions.ANDROID_LIFECYCLE_VERSION}"

    const val SQLITE = "androidx.sqlite:sqlite-ktx:${BuildDependencyVersions.SQLITE_VERSION}"
    const val COMPOSE_RUNTIME = "androidx.compose.runtime:runtime-livedata:${BuildDependencyVersions.COMPOSE_UI_VERSION}"
    const val NAVIGATION_COMPOSE = "androidx.navigation:navigation-compose:${BuildDependencyVersions.NAVIGATION_COMPOSE_VERSION}"

    const val COIL = "io.coil-kt:coil-compose:${BuildDependencyVersions.COIL_VERSION}"
}