plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":kotlin-react-intl"))

    implementation(kotlinWrapperDependency("react-dom"))
    implementation(kotlinWrapperDependency("emotion"))
}

configureKotlinJs()