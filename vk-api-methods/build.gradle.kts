dependencies {
    api(project(":vk-api-generated"))
    api(project(":vk-api-core"))

    // For LongPoll
    val coroutinesVersion = "1.3.3"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")

    testImplementation(project(":vk-api-ktor"))

    val ktorVersion = "1.3.0-rc"
    testImplementation("io.ktor:ktor-client-apache:$ktorVersion")
    testImplementation("io.ktor:ktor-server-netty:$ktorVersion")
}
