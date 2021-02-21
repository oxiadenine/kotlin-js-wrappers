import org.gradle.api.*
import org.gradle.api.publish.maven.*
import org.gradle.kotlin.dsl.*

class KotlinJsWrapperPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            apply(plugin = "org.jetbrains.kotlin.js")

            repositories {
                jcenter()
            }

            dependencies {
                "implementation"("org.jetbrains.kotlinx:kotlinx-html-js:$kotlinxHtmlJsVersion")
            }

            kotlin.apply {
                js {
                    browser {
                        webpackTask {
                            cssSupport.enabled = true
                        }

                        runTask {
                            cssSupport.enabled = true
                        }
                    }

                    binaries.executable()

                    compilations.configureEach {
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
        }
    }
}

class KotlinJsWrapperSamplesPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            val parentProjectName = parent!!.project.name
            val parentProjectVersion = parent!!.project.version as String

            repositories {
                jcenter()
                maven("https://dl.bintray.com/kotlin/kotlin-js-wrappers")
            }

            dependencies {
                "implementation"(project(":$parentProjectName"))

                "implementation"("org.jetbrains:kotlin-react:$kotlinReactVersion-kotlin-$kotlinVersion")
                "implementation"("org.jetbrains:kotlin-react-dom:$kotlinReactDomVersion-kotlin-$kotlinVersion")
                "implementation"("org.jetbrains:kotlin-styled:$kotlinStyledVersion-kotlin-$kotlinVersion")
            }

            kotlin.apply {
                val packageName = parentProjectName.replaceBefore("-", "").removePrefix("-")
                val packageVersion = parentProjectVersion.replaceAfter("-", "").removeSuffix("-")

                sourceSets {
                    getByName("main") {
                        dependencies {
                            implementation(npm(packageName, packageVersion))
                        }
                    }
                }
            }
        }
    }
}

class KotlinJsWrapperPublishPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            apply(plugin = "com.jfrog.bintray")
            apply(plugin = "maven-publish")

            val pkgVersionName = "${project.version}-kotlin-$kotlinVersion"

            bintray.apply {
                user = System.getenv("BINTRAY_USER")
                key = System.getenv("BINTRAY_KEY")
                publish = true

                pkg = PackageConfig().apply {
                    repo = "kotlin-js-wrappers"
                    name = project.name
                    vcsUrl = "https://github.com/samgarasx/kotlin-js-wrappers.git"
                    setLicenses("Apache-2.0")
                    version = VersionConfig().apply {
                        name = pkgVersionName
                    }
                }

                setPublications("Publication")
            }

            publishing.apply {
                publications.create<MavenPublication>("Publication") {
                    groupId = "com.github.samgarasx"
                    artifactId = project.name
                    version = pkgVersionName

                    from(components["kotlin"])
                }
            }
        }
    }
}
