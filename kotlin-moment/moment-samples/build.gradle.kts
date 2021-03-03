plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":kotlin-moment"))

    implementation(kotlinWrapperDependency("styled"))
}
