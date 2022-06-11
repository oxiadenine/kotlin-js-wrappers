plugins {
    kotlin("js")
}

dependencies {
    api(npmPackage("uikit"))
}

configureKotlinJs()
configurePublication()