plugins {
    kotlin("js")
    id("wrapper-publish")
}

dependencies {
    api(kotlinWrapperDependency("react"))

    api(npmPackage("react-responsive"))
}
