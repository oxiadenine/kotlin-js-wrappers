plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":kotlin-react-responsive"))

    implementation(kotlinWrapperDependency("styled"))
}
