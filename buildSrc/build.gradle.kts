plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("kotlinJsWrapperPlugin") {
            id = "kotlin-js-wrapper"
            implementationClass = "KotlinJsWrapperPlugin"
        }
        register("kotlinJsWrapperSamplesPlugin") {
            id = "kotlin-js-wrapper-samples"
            implementationClass = "KotlinJsWrapperSamplesPlugin"
        }
        register("kotlinJsWrapperPublishPlugin") {
            id = "kotlin-js-wrapper-publish"
            implementationClass = "KotlinJsWrapperPublishPlugin"
        }
    }
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
    implementation("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.5")
}
