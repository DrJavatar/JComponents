plugins {
    kotlin("jvm") version "1.5.21"
}

group = "com.javatar"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.junit.jupiter:junit-jupiter-api:5.8.0-RC1")

    testImplementation("io.insert-koin:koin-core:3.1.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}