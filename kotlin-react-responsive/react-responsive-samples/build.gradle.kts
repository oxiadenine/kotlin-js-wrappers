plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":kotlin-react-responsive"))

    implementation(kotlinWrapperDependency("react-dom"))
    implementation(kotlinWrapperDependency("react-css"))
}
