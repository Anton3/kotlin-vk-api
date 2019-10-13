dependencies {
    val jacksonVersion = "2.10.0"
    api("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$jacksonVersion")
    api("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
    api("com.fasterxml.jackson.core:jackson-core:$jacksonVersion")
}
