plugins {
    kotlin("js")
    `wrapper-publish`
}

dependencies {
    api(kotlinWrapperDependency("react-legacy"))

    api(npmPackage("react-responsive"))
}
