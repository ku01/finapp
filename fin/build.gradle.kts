val buildImage: String by rootProject.extra
val liquibaseVer: String by rootProject.extra
val postgresqlVer: String by rootProject.extra
val jacksonModuleKotlinVer: String by rootProject.extra

plugins {
    val kotlinVer = "1.6.10"
    kotlin("plugin.spring") version kotlinVer
    kotlin("plugin.jpa") version kotlinVer
    id("org.springframework.boot") version "2.6.6"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

tasks.jar {
    enabled = false
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    implementation("org.liquibase:liquibase-core:$liquibaseVer")
    runtimeOnly("org.postgresql:postgresql:$postgresqlVer")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonModuleKotlinVer")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}