plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":kotlin-antd"))
    implementation(project(":kotlin-moment"))

    implementation(kotlinWrapperDependency("styled"))
}
