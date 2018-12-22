import org.gradle.api.tasks.bundling.Jar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.11")
    }
}

plugins {
    java
    kotlin("jvm") version "1.3.11"
}

subprojects {
    group = "com.github.Anton3"
    version = "0.3.0"

    repositories {
        mavenCentral()
    }

    apply(plugin = "kotlin")
    apply(plugin = "maven")

    tasks.withType(KotlinCompile::class.java).all {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }

    dependencies {
        val jacksonVersion = "2.9.7"
        api("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$jacksonVersion")
        api("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
        api("com.fasterxml.jackson.core:jackson-core:$jacksonVersion")

        val kotlinVersion = "1.3.11"
        implementation(kotlin("stdlib-jdk8:$kotlinVersion"))
        implementation(kotlin("reflect:$kotlinVersion"))

        implementation("io.github.microutils:kotlin-logging:1.6.22")

        testImplementation("junit:junit:4.12")
        testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.11.0")
    }

    val sourcesJar by tasks.creating(Jar::class) {
        dependsOn("classes")
        classifier = "sources"
        val sourceSets: SourceSetContainer by project
        from(sourceSets["main"].allSource)
    }

    artifacts {
        add("archives", sourcesJar)
    }
}
