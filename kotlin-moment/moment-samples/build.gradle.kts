plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":kotlin-moment"))

    implementation(wrapperDependency("react"))
    implementation(wrapperDependency("react-dom"))
    implementation(wrapperDependency("styled"))

    implementation(npmPackage("moment"))
}
