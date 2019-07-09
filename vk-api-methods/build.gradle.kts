dependencies {
    api(project(":vk-api-generated"))

    // For LongPoll
    val coroutinesVersion = "1.3.0-M2"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")

    testImplementation(project(":vk-api-ktor"))

    val ktorVersion = "1.2.2"
    testImplementation("io.ktor:ktor-client-apache:$ktorVersion")

    testImplementation("org.apache.logging.log4j:log4j-1.2-api:2.11.2")
    testImplementation("io.github.microutils:kotlin-logging:1.6.26")
    testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.12.0")
}
