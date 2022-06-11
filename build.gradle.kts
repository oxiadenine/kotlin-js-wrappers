plugins {
    kotlin("js") apply false
}

subprojects {
    group = "io.sunland"
    version = if (!project.name.contains("samples")) {
        version(project.name)
    } else "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}