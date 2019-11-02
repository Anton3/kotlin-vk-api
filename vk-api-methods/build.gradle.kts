dependencies {
    api(project(":vk-api-generated"))
    api(project(":vk-api-core"))

    // For LongPoll
    val coroutinesVersion = "1.3.2"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")

    testImplementation(project(":vk-api-ktor"))

    val ktorVersion = "1.2.5"
    testImplementation("io.ktor:ktor-client-apache:$ktorVersion")
    testImplementation("io.ktor:ktor-server-netty:$ktorVersion")
}
