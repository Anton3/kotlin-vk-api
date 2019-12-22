dependencies {
    val guava = rootProject.ext["guava"]
    val log4j = rootProject.ext["log4j"]

    api(project(":vk-api-base"))

    // For naming conversions
    implementation("com.google.guava:guava:$guava")

    // Not testImplementation, because this package contains a complete program
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:$log4j")
}
