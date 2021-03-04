plugins {
    kotlin("js") apply false
}

subprojects {
    repositories {
        jcenter()
        maven("https://dl.bintray.com/kotlin/kotlin-js-wrappers")
    }

    configureKotlinJs()
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}
