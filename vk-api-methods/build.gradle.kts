plugins {
    `java-library`
}

dependencies {
    api(project(":vk-api-generated"))

    // For LongPoll
    val coroutinesVersion = "1.0.1"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")

    testImplementation(project(":vk-api-ktor"))

    val ktorVersion = "1.0.0"
    testImplementation("io.ktor:ktor-client-apache:$ktorVersion")
}
