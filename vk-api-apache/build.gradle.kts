dependencies {
    api(project(":vk-api-core"))

    val httpClientAsync = rootProject.ext["httpClientAsync"]
    val httpClientMime = rootProject.ext["httpClientMime"]

    api("org.apache.httpcomponents:httpasyncclient:$httpClientAsync")
    implementation("org.apache.httpcomponents:httpmime:$httpClientMime")
}
