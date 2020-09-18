import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.*

class KotlinJsWrapperPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            apply(plugin = "org.jetbrains.kotlin.js")

            repositories {
                jcenter()
            }

            dependencies {
                "implementation"(kotlin("stdlib-js"))

                "implementation"("org.jetbrains.kotlinx:kotlinx-html-js:$kotlinxHtmlJsVersion")
            }

            kotlin.apply {
                js {
                    browser {
                        binaries.executable()

                        webpackTask {
                            cssSupport.enabled = true
                        }

                        runTask {
                            cssSupport.enabled = true
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
