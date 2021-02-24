plugins {
    kotlin("js")
    id("wrapper-publish")
}

dependencies {
    implementation(wrapperDependency("react"))
}
