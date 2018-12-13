import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
    maven("https://dl.bintray.com/alatushkin/maven")
}

plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.9.7")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.7")
    implementation("com.fasterxml.jackson.core:jackson-core:2.9.7")

    implementation("com.google.guava:guava:11.0.2")

    implementation("io.github.microutils:kotlin-logging:1.6.22")
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.11.0")

    testImplementation("junit:junit:4.12")
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
