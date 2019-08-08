dependencies {
    api(project(":vk-api-generated"))

    // For LongPoll
    val coroutinesVersion = "1.3.0-M2"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")

    testImplementation(project(":vk-api-ktor"))

    val ktorVersion = "1.2.2"
    testImplementation("io.ktor:ktor-client-apache:$ktorVersion")
}
