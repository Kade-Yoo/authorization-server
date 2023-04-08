plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.spring.io/snapshot" )
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:2.5.4")
    implementation("org.springframework.boot:spring-boot-starter-security:2.5.4")
    implementation("org.springframework.security:spring-security-oauth2-authorization-server:0.2.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}