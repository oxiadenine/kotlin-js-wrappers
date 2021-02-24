plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":kotlin-react-intl"))

    implementation(wrapperDependency("react"))
    implementation(wrapperDependency("react-dom"))
    implementation(wrapperDependency("styled"))

    implementation(npmPackage("react-intl"))
}
