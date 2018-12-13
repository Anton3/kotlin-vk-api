import org.jetbrains.kotlin.gradle.dsl.Coroutines
import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension
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

tasks.withType(KotlinCompile::class.java).all {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

subprojects {
    version = "0.1"

    apply {
        plugin("org.jetbrains.kotlin.jvm")
    }

    tasks.withType(KotlinCompile::class.java).all {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }

    tasks.withType(KotlinCompile::class.java).all {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
        }
    }

    dependencies {
        implementation(kotlin("stdlib-jdk8"))
        implementation(kotlin("reflect"))
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.0.1")

        testImplementation("junit:junit:4.12")
    }
}
