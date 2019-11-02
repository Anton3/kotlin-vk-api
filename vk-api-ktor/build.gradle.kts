dependencies {
    api(project(":vk-api-core"))

    val ktorVersion = "1.2.5"
    api("io.ktor:ktor-client-core-jvm:$ktorVersion")
}
