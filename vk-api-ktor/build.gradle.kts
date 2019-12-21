dependencies {
    api(project(":vk-api-core"))

    val ktorVersion = "1.3.0-rc"
    api("io.ktor:ktor-client-core-jvm:$ktorVersion")
}
