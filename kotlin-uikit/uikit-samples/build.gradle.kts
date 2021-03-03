plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":kotlin-uikit"))

    implementation(kotlinWrapperDependency("styled"))
}
