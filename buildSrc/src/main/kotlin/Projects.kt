import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper

fun Project.configureKotlinJs() {
    plugins.withType<KotlinJsPluginWrapper> {
        extensions.configure<KotlinJsProjectExtension> {
            js {
                browser {
                    if (project.name.contains("samples")) {
                        commonWebpackConfig {
                            cssSupport.enabled = true
                        }

                        binaries.executable()
                    }
                }
            }
        }

        tasks.withType<KotlinJsCompile>().configureEach {
            kotlinOptions {
                if (name == "compileKotlinJs") {
                    outputFile = project.rootProject.buildDir
                        .resolve("js/packages/${project.name}/kotlin")
                        .resolve("${project.name}.js").absolutePath
                    sourceMapEmbedSources = "always"
                    sourceMap = true
                } else {
                    sourceMap = false
                }
            }
        }
    }
}
