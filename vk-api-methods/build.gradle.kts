dependencies {
    api(project(":vk-api-generated"))
    api(project(":vk-api-core"))

    // For LongPoll
    val coroutines = rootProject.ext["coroutines"]
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines")

    testImplementation(project(":vk-api-simple"))

    val ktor = rootProject.ext["ktor"]
    testImplementation("io.ktor:ktor-client-apache:$ktor")
    testImplementation("io.ktor:ktor-server-netty:$ktor")
}
