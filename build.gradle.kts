import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.41")
    }
}

plugins {
    `java-library`
    kotlin("jvm") version "1.3.41"
}

repositories {
    mavenCentral()
}

subprojects {
    group = "com.github.Anton3"
    version = "0.7.0"

    repositories {
        mavenCentral()
        maven(url = "https://dl.bintray.com/kotlin/kotlinx/")
    }

    apply(plugin = "java-library")
    apply(plugin = "kotlin")
    apply(plugin = "maven")

    tasks.withType(KotlinCompile::class.java).all {
        kotlinOptions {
            jvmTarget = "1.8"
            freeCompilerArgs = freeCompilerArgs + "-Xuse-experimental=kotlin.Experimental"
        }
    }

    dependencies {
        val jacksonVersion = "2.9.9"
        api("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$jacksonVersion")
        api("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
        api("com.fasterxml.jackson.core:jackson-core:$jacksonVersion")

        val kotlinVersion = "1.3.41"
        implementation(kotlin("stdlib-jdk8:$kotlinVersion"))
        implementation(kotlin("reflect:$kotlinVersion"))

        implementation("io.github.microutils:kotlin-logging:1.6.26")

        testImplementation("junit:junit:4.12")
        testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.12.0")
    }

    val sourcesJar by tasks.creating(Jar::class) {
        dependsOn("classes")

        // archiveClassifier is available since Gradle 5.0 :-(
        @Suppress("DEPRECATION")
        classifier = "sources"

        val sourceSets: SourceSetContainer by project
        from(sourceSets["main"].allSource)
    }

    artifacts {
        add("archives", sourcesJar)
    }
}
