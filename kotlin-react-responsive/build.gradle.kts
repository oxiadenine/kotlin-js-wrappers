plugins {
    kotlin("js")
}

dependencies {
    api(kotlinWrapperDependency("react"))

    api(npmPackage("react-responsive"))
}

configureKotlinJs()
configurePublication()