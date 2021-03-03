plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":kotlin-react-intl"))

    implementation(kotlinWrapperDependency("styled"))
}
