plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":kotlin-uikit"))

    implementation(kotlinWrapperDependency("react"))
    implementation(kotlinWrapperDependency("react-dom"))
    implementation(kotlinWrapperDependency("react-css"))
}
