plugins {
    kotlin("js") apply false
}

subprojects {
    repositories {
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers")
    }

    configureKotlinJs()
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}
