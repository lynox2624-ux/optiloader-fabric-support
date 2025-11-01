plugins {
    id("fabric-loom") version "1.6-SNAPSHOT"
    id("maven-publish")
}

version = "1.0.0"
group = "com.optiloaderproof"

repositories {
    mavenCentral()
    maven("https://maven.fabricmc.net/")
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.4")
    mappings("net.fabricmc:yarn:1.21.4+build.1:v2")
    modImplementation("net.fabricmc:fabric-loader:0.16.0")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
    withSourcesJar()
}

tasks {
    jar {
        from("LICENSE") {
            rename { "${it}_${project.name}" }
        }
    }
}
