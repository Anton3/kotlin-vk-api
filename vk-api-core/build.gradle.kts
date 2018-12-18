import com.jfrog.bintray.gradle.BintrayExtension
import org.gradle.api.tasks.bundling.Jar
import java.util.Date

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
    maven("https://dl.bintray.com/alatushkin/maven")
}

plugins {
    java
    kotlin("jvm")
    `maven-publish`
    id("com.jfrog.bintray") version "1.8.1"
}

dependencies {
    val jacksonVersion = "2.9.7"
    api("com.fasterxml.jackson.core:jackson-core:$jacksonVersion")
    api("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
    api("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$jacksonVersion")

    // For executors
    val coroutinesVersion = "1.0.1"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:$coroutinesVersion")

    implementation("io.github.microutils:kotlin-logging:1.6.22")

    testImplementation("junit:junit:4.12")
    testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.11.0")
}

val sourcesJar by tasks.creating(Jar::class) {
    classifier = "sources"
    from(java.sourceSets["main"].allSource)
}

publishing {
    repositories {
        maven {
            // change to point to your repo, e.g. http://my.org/repo
            url = uri("$buildDir/repo")
        }
    }

    publications {
        create("mavenJava", MavenPublication::class.java) {
            from(components["java"])
            artifact(sourcesJar)
            artifactId = "kotlin-vk-api"

        }
    }
}

bintray {
    user = project.properties["bintrayUser"]?.toString() ?: System.getenv("BINTRAY_USER")
    key = project.properties["bintrayKey"]?.toString() ?: System.getenv("BINTRAY_KEY")
    setPublications("mavenJava")
    publish = true
    override = true

    pkg(delegateClosureOf<BintrayExtension.PackageConfig> {
        repo = "maven"
        name = "kotlin-vk-api"
        setLicenses("Apache-2.0")
        vcsUrl = "https://github.com/alatushkin/kotlin-vk-api.git"

        version(delegateClosureOf<BintrayExtension.VersionConfig> {
            name = "${project.version}-snapshot"
            desc = "Vk api build snapshot"
            released = Date().toString()
            vcsTag = "${project.version}"
        })
    })
}
