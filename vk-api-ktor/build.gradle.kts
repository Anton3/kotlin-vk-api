plugins {
    `java-library`
}

dependencies {
    api(project(":vk-api-core"))

    val ktorVersion = "1.0.0"
    api("io.ktor:ktor-client-core-jvm:$ktorVersion")
}
