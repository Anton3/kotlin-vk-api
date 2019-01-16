dependencies {
    api(project(":vk-api-core"))

    val ktorVersion = "1.1.1"
    api("io.ktor:ktor-client-core-jvm:$ktorVersion")
}
