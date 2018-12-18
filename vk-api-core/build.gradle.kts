import org.gradle.api.tasks.bundling.Jar
import java.util.Date

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    // For executors
    val coroutinesVersion = "1.0.1"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:$coroutinesVersion")
}

val sourcesJar by tasks.creating(Jar::class) {
    classifier = "sources"
    from(java.sourceSets["main"].allSource)
}
