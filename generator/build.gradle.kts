dependencies {
    val jacksonVersion = "2.9.9"

    // For naming conversions
    implementation("com.google.guava:guava:28.0-jre")

    // Not testImplementation, because this package contains a complete program
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.12.0")

    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$jacksonVersion")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
    implementation("com.fasterxml.jackson.core:jackson-core:$jacksonVersion")
}
