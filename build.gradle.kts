import com.moowork.gradle.node.npm.NpmTask
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

group = "io.kotlinspain"
version = "0.1.0"

plugins {
    id("kotlin2js") version "1.3.50" apply false
    id("com.jfrog.bintray") version "1.8.4"
    id("com.moowork.node") version "1.3.1"
    `maven-publish`
    java
}

subprojects {
    apply("$rootDir/versions.gradle.kts")

    repositories {
        jcenter()
        maven("https://dl.bintray.com/kotlin/kotlin-js-wrappers")
        maven("https://dl.bintray.com/kotlinspain/kotlin-js-wrappers")
    }

    extra.set("applyKotlinJS", {
        apply(plugin = "kotlin2js")

        dependencies {
            "implementation"(kotlin("stdlib-js"))
        }

        tasks.withType<Kotlin2JsCompile> {
            kotlinOptions {
                outputFile = "$projectDir/build/classes/main/${project.name}.js"
                moduleKind = "commonjs"
                sourceMap = true
                sourceMapEmbedSources = "always"
            }
        }
    })

    extra.set("configurePublishing", { baseVersion: String ->
        apply {
            plugin("kotlin2js")
            plugin("com.jfrog.bintray")
            plugin("com.moowork.node")
            plugin("maven-publish")
            plugin("java")
        }

        val kotlinVersion: String by project.extra
        val kotlinReactVersion: String by project.extra
        val kotlinReactDomVersion: String by project.extra
        val kotlinAntdVersion: String by project.extra
        val kotlinMomentVersion: String by project.extra
        val kotlinReactIntlVersion: String by project.extra
        val kotlinReactResponsiveVersion: String by project.extra

        val sourcesJar = task<Jar>("sourcesJar") {
            setProperty("archiveClassifier", "sources")
            from(sourceSets["main"].allSource)
        }

        artifacts {
            add("archives", sourcesJar)
        }

        val versionName = "$baseVersion-kotlin-$kotlinVersion"

        bintray {
            user = System.getenv("BINTRAY_USER")
            key = System.getenv("BINTRAY_KEY")
            publish = true

            pkg = PackageConfig().apply {
                repo = "kotlin-js-wrappers"
                name = project.name
                desc = "Kotlin wrapper for Ant Design library"
                userOrg = "kotlinspain"
                vcsUrl = "https://github.com/kotlinspain/kotlin-antd-wrapper.git"
                setLabels("kotlin", "js", "ant", "design")
                setLicenses("Apache-2.0")
                version = VersionConfig().apply {
                    name = versionName
                }

                setPublications("Publication")
            }
        }

        publishing {
            publications.register("Publication", MavenPublication::class) {
                from(components["java"])
                artifact(sourcesJar)
                groupId = "io.kotlinspain"
                artifactId = project.name
                version = versionName
            }
        }

        tasks {
            register<Copy>("processPkg") {
                from("..")
                from(".")
                into("build/npm")
                include("README.md")
                include("package.json")
                expand(
                    Pair("kotlin_version", kotlinVersion),
                    Pair("kotlin_react_version", kotlinReactVersion),
                    Pair("kotlin_react_dom_version", kotlinReactDomVersion),
                    Pair("kotlin_antd_version", kotlinAntdVersion),
                    Pair("kotlin_moment_version", kotlinMomentVersion),
                    Pair("kotlin_react_intl_version", kotlinReactIntlVersion),
                    Pair("kotlin_react_responsive_version", kotlinReactResponsiveVersion)
                )
            }

            register<Copy>("buildPkg") {
                from(".")
                into("build/npm")
                exclude("README.md")
                exclude("package.json")
                exclude("build/npm")
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
                dependsOn("buildPkg", "processPkg")
            }
        }
    })
}
