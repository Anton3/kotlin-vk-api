plugins {
    `java-library`
}

dependencies {
    // For executors
    val coroutinesVersion = "1.0.1"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:$coroutinesVersion")
}
