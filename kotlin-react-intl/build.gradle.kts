plugins {
    kotlin("js")
    `wrapper-publish`
}

dependencies {
    api(kotlinWrapperDependency("react"))

    api(npmPackage("react-intl"))
}
