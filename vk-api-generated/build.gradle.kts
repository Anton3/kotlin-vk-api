import org.gradle.api.tasks.bundling.Jar
import java.util.Date

plugins {
    `java-library`
}

dependencies {
    api(project(":vk-api-core"))
}

val sourcesJar by tasks.creating(Jar::class) {
    classifier = "sources"
    from(java.sourceSets["main"].allSource)
}
