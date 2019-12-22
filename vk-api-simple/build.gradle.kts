plugins {
    `java-library`
}

dependencies {
    api(project(":vk-api-methods"))
    api(project(":vk-api-ktor"))

    val ktor = rootProject.ext["ktor"]
    implementation("io.ktor:ktor-client-cio:$ktor")
}
