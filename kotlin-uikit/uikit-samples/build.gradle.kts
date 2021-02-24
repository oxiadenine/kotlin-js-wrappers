plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":kotlin-uikit"))

    implementation(wrapperDependency("react"))
    implementation(wrapperDependency("react-dom"))
    implementation(wrapperDependency("styled"))

    implementation(npmPackage("uikit"))
}
