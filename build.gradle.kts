plugins {
    id("java")
}

group = "com.optiloaderproof"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://maven.fabricmc.net/")
}

dependencies {
    implementation("net.fabricmc:fabric-loader:0.14.24")
}