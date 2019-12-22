dependencies {
    val jackson = rootProject.ext["jackson"]
    api("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$jackson")
    api("com.fasterxml.jackson.module:jackson-module-kotlin:$jackson")
    api("com.fasterxml.jackson.core:jackson-core:$jackson")
}
