dependencies {
    api(project(":vk-api-core"))

    val ktor = rootProject.ext["ktor"]
    api("io.ktor:ktor-client-core-jvm:$ktor")
}
