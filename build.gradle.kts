import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper

plugins {
    kotlin("js") apply false
}

subprojects {
    group = "io.sunland"
    version = if (!project.name.contains("samples")) {
        version(project.name)
    } else "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }

    plugins.withType<KotlinJsPluginWrapper> {
        extensions.configure<KotlinJsProjectExtension> {
            if (project.name.contains("samples")) {
                js(IR) {
                    browser {
                        commonWebpackConfig {
                            cssSupport.enabled = true
                        }
                    }

                    binaries.executable()
                }
            } else  {
                js(BOTH) {
                    browser()
                }
            }
        }

        tasks.withType<KotlinJsCompile>().configureEach {
            kotlinOptions {
                if (name == "compileKotlinJs") {
                    sourceMapEmbedSources = "always"
                    sourceMap = true
                } else {
                    sourceMap = false
                }
            }
        }
    }
}

tasks.wrapper {
    gradleVersion = "7.1.1"
}
