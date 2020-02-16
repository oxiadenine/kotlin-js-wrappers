import com.moowork.gradle.node.npm.NpmTask

group = "com.github.samgarasx"

plugins {
    kotlin("js") version "1.3.61"
    id("com.jfrog.bintray") version "1.8.4"
    id("com.moowork.node") version "1.3.1"
    `maven-publish`
}

repositories {
    jcenter()
}

project(":kotlin-antd").version = "3.20.3-pre.2"
project(":kotlin-moment").version = "2.24.0-pre.1"
project(":kotlin-react-intl").version = "3.1.12-pre.1"
project(":kotlin-react-responsive").version = "7.0.0-pre.1"

subprojects {
    apply("$rootDir/versions.gradle.kts")

    repositories {
        jcenter()
        maven("https://dl.bintray.com/kotlin/kotlin-js-wrappers")
        maven("https://dl.bintray.com/samgarasx/kotlin-js-wrappers")
    }

    val projectVersion = project.version as String

    val kotlinVersion: String by project.extra
    val kotlinReactVersion: String by project.extra
    val kotlinReactDomVersion: String by project.extra
    val reactVersion: String by project.extra
    val reactDomVersion: String by project.extra
    val coreJsVersion: String by project.extra
    val styleLoaderVersion: String by project.extra
    val cssLoaderVersion: String by project.extra

    extra.set("configureKotlinJs", {
        apply(plugin = "org.jetbrains.kotlin.js")

        dependencies {
            implementation(kotlin("stdlib-js"))
        }

        kotlin {
            target {
                browser {
                    useCommonJs()
                }
            }
        }
    })

    extra.set("configureSamples", {
        val parentProjectNAme = parent!!.project.name
        val parentProjectVersion = parent!!.project.version as String

        dependencies {
            implementation(project(":$parentProjectNAme"))

            implementation("org.jetbrains:kotlin-react:$kotlinReactVersion-kotlin-$kotlinVersion")
            implementation("org.jetbrains:kotlin-react-dom:$kotlinReactDomVersion-kotlin-$kotlinVersion")
        }

        kotlin {
            val packageName = parentProjectNAme.replaceBefore("-", "").removePrefix("-")
            val packageVersion = parentProjectVersion.replaceAfter("-", "").removeSuffix("-")

            sourceSets {
                main {
                    dependencies {
                        implementation(npm(packageName, packageVersion))
                        implementation(npm("react", reactVersion))
                        implementation(npm("react-dom", reactDomVersion))
                        implementation(npm("core-js", coreJsVersion))
                        implementation(npm("style-loader", styleLoaderVersion))
                        implementation(npm("css-loader", cssLoaderVersion))
                    }
                }
            }
        }
    })

    extra.set("configureBintrayPublishing", {
        apply {
            plugin("com.jfrog.bintray")
            plugin("com.moowork.node")
            plugin("maven-publish")
        }

        val pkgVersionName = "$projectVersion-kotlin-$kotlinVersion"

        bintray {
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

                setPublications("Publication")
            }
        }

        publishing {
            publications.register("Publication", MavenPublication::class) {
                from(components["kotlin"])
                groupId = "com.github.samgarasx"
                artifactId = project.name
                version = pkgVersionName
            }
        }
    })

    extra.set("configureNpmPublishing", { packageVersions: Map<String, String> ->
        tasks {
            register<Copy>("processPkg") {
                from(project.projectDir)
                into("${project.buildDir}/npm")
                include("README.md")
                include("package.json")
                expand(packageVersions)
            }

            register<Copy>("buildPkg") {
                from("${rootProject.buildDir}/js/packages/${rootProject.name}-${project.name}")
                into("${project.buildDir}/npm")
                exclude("package.json")
                exclude("package.json.hash")
                exclude("webpack.config.js")
                dependsOn("build")
            }

            task<NpmTask>("npmPublish") {
                setNpmCommand("publish")
                setArgs(listOf("--access", "public"))
                setWorkingDir(file("${project.buildDir}/npm"))
                dependsOn("buildPkg", "processPkg")
            }

            task<NpmTask>("npmPack") {
                setNpmCommand("pack")
                setWorkingDir(file("${project.buildDir}/npm"))
                dependsOn( "buildPkg", "processPkg")
            }
        }
    })
}
