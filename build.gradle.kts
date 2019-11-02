import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50")
    }
}

plugins {
    `java-library`
    kotlin("jvm") version "1.3.50"
    id("com.github.ManifestClasspath") version "0.1.0-RELEASE"
}

repositories {
    mavenCentral()
}

subprojects {
    group = "com.github.Anton3"
    version = "0.10.5"

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
        val kotlinVersion = "1.3.50"
        implementation(kotlin("stdlib-jdk8:$kotlinVersion"))
        implementation(kotlin("reflect:$kotlinVersion"))

        implementation("org.apache.logging.log4j:log4j-core:2.12.1")
        implementation("org.apache.logging.log4j:log4j-api-kotlin:1.0.0")

        testImplementation("junit:junit:4.12")
        testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.12.1")
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
