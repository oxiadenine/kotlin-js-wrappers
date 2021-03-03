plugins {
    kotlin("js")
    id("wrapper-publish")
}

dependencies {
    api(npmPackage("uikit"))
}
