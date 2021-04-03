plugins {
    kotlin("js") apply false
}

subprojects {
    repositories {
        jcenter()
        mavenCentral()
    }

    configureKotlinJs()
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}
