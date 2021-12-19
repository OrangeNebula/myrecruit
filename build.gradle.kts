import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.5.6"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.5.31"
	kotlin("plugin.spring") version "1.5.31"
	kotlin("plugin.jpa") version "1.5.31"
}

group = "com.my.recruit"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

allprojects {
	group = "com.myrecruit"
	version = "0.0.1-SNAPSHOT"

	repositories {
		maven("https://plugins.gradle.org/m2/")
		mavenCentral()
	}
}

subprojects {
	apply {
		plugin("kotlin")
		plugin("io.spring.dependency-management")
		plugin("kotlin-spring")
		plugin("org.springframework.boot")
		plugin("kotlin-jpa")
	}

	dependencies {
		implementation("org.springframework.boot:spring-boot-starter-data-jpa")
		implementation("com.h2database:h2")
		testImplementation("org.springframework.boot:spring-boot-starter-test")
		testImplementation("io.kotest:kotest-runner-junit5:4.6.3")
		testImplementation("io.kotest:kotest-assertions-core:4.6.3")
		testImplementation("io.kotest:kotest-property:4.6.3")
		testImplementation("io.mockk:mockk:1.12.0")
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict")
			jvmTarget = "16"
		}
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}
