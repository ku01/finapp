import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val buildImage by extra { "docker://bellsoft/liberica-openjdk-alpine:11.0.6-10" }

plugins {
	kotlin("jvm") version "1.6.10"
}

repositories {
	mavenCentral()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

subprojects {
	group = "dev.ku01.finapp"
	apply {
		plugin("org.jetbrains.kotlin.jvm")
	}
	dependencies {
		"implementation"("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
		"implementation"("org.jetbrains.kotlin:kotlin-reflect")
	}
}
