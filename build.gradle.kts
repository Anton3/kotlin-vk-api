import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    extra["kotlin"] = "1.3.70"
    extra["ktor"] = "1.3.0"
    extra["coroutines"] = "1.3.3"
    extra["jackson"] = "2.10.2"
    extra["guava"] = "28.2-jre"
    extra["log4j"] = "2.13.0"
    extra["log4jKotlin"] = "1.0.0"
    extra["junit"] = "5.6.0"
    extra["httpClientAsync"] = "4.1.4"
    extra["httpClientMime"] = "4.5.11"

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${rootProject.extra["kotlin"]}")
    }
}

plugins {
    `java-library`
    kotlin("jvm") version "1.3.70"
    id("com.github.ManifestClasspath") version "0.1.0-RELEASE"
}

repositories {
    mavenCentral()
}

tasks.withType(KotlinCompile::class.java).all {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

subprojects {
    group = "com.github.Anton3"
    version = "0.12.2"

    repositories {
        mavenCentral()
        maven(url = "https://dl.bintray.com/kotlin/kotlinx/")
    }

    apply(plugin = "java-library")
    apply(plugin = "kotlin")
    apply(plugin = "maven")
    apply(plugin = "com.github.ManifestClasspath")

    tasks.withType(KotlinCompile::class.java).all {
        kotlinOptions {
            jvmTarget = "1.8"
            freeCompilerArgs = freeCompilerArgs + "-Xuse-experimental=kotlin.Experimental"
        }
    }

    dependencies {
        val kotlin = rootProject.ext["kotlin"]
        val log4j = rootProject.ext["log4j"]
        val junit = rootProject.ext["junit"]
        val log4jKotlin = rootProject.ext["log4jKotlin"]

        implementation(kotlin("stdlib-jdk8:$kotlin"))
        implementation(kotlin("reflect:$kotlin"))

        implementation("org.apache.logging.log4j:log4j-core:$log4j")
        implementation("org.apache.logging.log4j:log4j-api-kotlin:$log4jKotlin")

        testImplementation("org.junit.jupiter:junit-jupiter-api:$junit")
        testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:$log4j")
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
