plugins {
    kotlin("js")
}

dependencies {
    api(kotlinWrapperDependency("react"))

    api(npmPackage("react-intl"))
}

configureKotlinJs()
configurePublication()