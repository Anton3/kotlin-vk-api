dependencies {
    val coroutines = rootProject.ext["coroutines"]
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:$coroutines")
}
