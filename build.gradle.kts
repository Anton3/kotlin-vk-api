import org.jetbrains.kotlin.gradle.dsl.Coroutines
import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenLocal()
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

tasks.withType(KotlinCompile::class.java).all {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

subprojects {
    group = "name.anton3.utils"
    version = "0.1"

    apply {
        plugin("org.jetbrains.kotlin.jvm")
    }

    tasks.withType(KotlinCompile::class.java).all {
        kotlinOptions {
            jvmTarget = "1.8"
            freeCompilerArgs = listOf("-Xjsr305=strict")
        }
    }

    dependencies {
        val jacksonVersion = "2.9.7"
        api("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$jacksonVersion")
        api("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
        api("com.fasterxml.jackson.core:jackson-core:$jacksonVersion")

        implementation(kotlin("stdlib-jdk8"))
        implementation(kotlin("reflect"))

        implementation("io.github.microutils:kotlin-logging:1.6.22")

        testImplementation("junit:junit:4.12")
        testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.11.0")
    }
}
