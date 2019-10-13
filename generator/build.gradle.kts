dependencies {
    val jacksonVersion = "2.10.0"

    api(project(":vk-api-base"))

    // For naming conversions
    implementation("com.google.guava:guava:28.0-jre")

    // Not testImplementation, because this package contains a complete program
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.12.0")
}
