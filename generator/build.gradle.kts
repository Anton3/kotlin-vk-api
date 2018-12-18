import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    // For naming conversions
    implementation("com.google.guava:guava:11.0.2")

    // Not testImplementation, because this package contains a complete program
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.11.0")
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions.jvmTarget = "1.8"

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions.jvmTarget = "1.8"
