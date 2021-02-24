import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.get

plugins {
    id("com.jfrog.bintray")
    `maven-publish`
}

val pkgVersionName = "${version(project.name)}-kotlin-${kotlinVersion()}"

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
    }

    setPublications("kotlin-wrapper")
}

publishing {
    publications.create<MavenPublication>("kotlin-wrapper") {
        groupId = "com.github.samgarasx"
        artifactId = project.name
        version = pkgVersionName

        from(components["kotlin"])
    }
}
