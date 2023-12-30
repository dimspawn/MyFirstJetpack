import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.implementation(dependencyNotation: String): Dependency? {
    return add("implementation", dependencyNotation)
}

fun DependencyHandler.testImplementation(dependencyNotation: String): Dependency? {
    return add("testImplementation", dependencyNotation)
}

fun DependencyHandler.androidTestImplementation(dependencyNotation: String): Dependency? {
    return add("androidTestImplementation", dependencyNotation)
}

fun DependencyHandler.debugImplementation(dependencyNotation: String): Dependency? {
    return add("debugImplementation", dependencyNotation)
}

fun DependencyHandler.kapt(dependencyNotation: String): Dependency? {
    return add("kapt", dependencyNotation)
}

fun DependencyHandler.api(dependencyNotation: String): Dependency? {
    return add("api", dependencyNotation)
}

fun DependencyHandler.appDependencies() {
    implementation(AppDependencies.LIFECYCLE_RUNTIME)
    implementation(AppDependencies.ACTIVITY_COMPOSE_KTX)
    implementation(AppDependencies.COMPOSE_UI)
    implementation(AppDependencies.COMPOSE_UI_GRAPHIC)
    implementation(AppDependencies.COMPOSE_UI_TOOLING_PREVIEW)
    implementation(AppDependencies.MATERIAL3)
    implementation(AppDependencies.COIL)
    androidTestImplementation(AppDependencies.TEST_ESPRESSO_CORE)
    androidTestImplementation(AppDependencies.UI_TEST_JUNIT)
    debugImplementation(AppDependencies.COMPOSE_UI_TOOLING)
    debugImplementation(AppDependencies.COMPOSE_UI_TEST_MANIFEST)
}

fun DependencyHandler.coreDependencies() {
    implementation(AppDependencies.MATERIAL)

    //room
    implementation(AppDependencies.ROOM_RUNTIME)
    kapt(AppDependencies.ROOM_COMPILER)
    implementation(AppDependencies.ROOM_KTX)
    androidTestImplementation(AppDependencies.ROOM_TESTING)

    //retrofit
    implementation(AppDependencies.RETROFIT)
    implementation(AppDependencies.RETROFIT_GSON)
    implementation(AppDependencies.OKHTTP3)

    //coroutine-flow
    implementation(AppDependencies.COROUTINE_CORE)
    implementation(AppDependencies.COROUTINE_ANDROID)
    api(AppDependencies.LIFECYCLE_LIVEDATA)

    //sqlite
    implementation(AppDependencies.SQLITE)
}

fun DependencyHandler.mainDependencies() {
    //common
    implementation(AppDependencies.APPCOMPAT)
    implementation(AppDependencies.CORE_KTX)

    //testing
    testImplementation(AppDependencies.JUNIT)
    androidTestImplementation(AppDependencies.TEST_EXT_JUNIT)
    androidTestImplementation(AppDependencies.TEST_ESPRESSO_CORE)

    //Glide
    implementation(AppDependencies.GLIDE)

    //Dagger
    implementation(AppDependencies.DAGGER)
    kapt(AppDependencies.DAGGER_COMPILER)

    //Shimmer
    implementation(AppDependencies.SHIMMER)

    //Lottie
    implementation(AppDependencies.LOTTIE)

    //viewModels in Activity and Fragment
    implementation(AppDependencies.ACTIVITY_KTX)
    implementation(AppDependencies.FRAGMENT_KTX)

    //compose runtime
    implementation(AppDependencies.COMPOSE_RUNTIME)

    //navigation
    implementation((AppDependencies.NAVIGATION_COMPOSE))
}