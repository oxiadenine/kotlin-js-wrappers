plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("kotlin-js") {
            id = "kotlin-js"
            implementationClass = "KotlinJsPlugin"
        }
        register("samples") {
            id = "samples"
            implementationClass = "SamplesPlugin"
        }
        register("bintray-publish") {
            id = "bintray-publish"
            implementationClass = "BintrayPublishPlugin"
        }
    }
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.0")
    implementation("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.5")
}
