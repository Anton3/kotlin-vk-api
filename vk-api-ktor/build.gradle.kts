import org.gradle.api.tasks.bundling.Jar
import java.util.Date

plugins {
    `java-library`
}

dependencies {
    api(project(":vk-api-methods"))

    val ktorVersion = "1.0.0"
    api("io.ktor:ktor-client-core-jvm:$ktorVersion")

    testImplementation("io.ktor:ktor-client-apache:$ktorVersion")
}

val sourcesJar by tasks.creating(Jar::class) {
    classifier = "sources"
    from(java.sourceSets["main"].allSource)
}
