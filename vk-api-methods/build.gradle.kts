plugins {
    `java-library`
}

dependencies {
    api(project(":vk-api-generated"))

    testImplementation(project(":vk-api-ktor"))

    val ktorVersion = "1.0.0"
    testImplementation("io.ktor:ktor-client-apache:$ktorVersion")
}
