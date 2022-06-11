import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper

fun Project.configureKotlinJs() {
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
                    moduleName = project.name

                    browser()
                }
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
            sourceMapPrefix = null
        }
    }
}