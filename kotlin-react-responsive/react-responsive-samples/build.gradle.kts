plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":kotlin-react-responsive"))

    implementation(wrapperDependency("react"))
    implementation(wrapperDependency("react-dom"))
    implementation(wrapperDependency("styled"))

    implementation(npmPackage("react-responsive"))
}
