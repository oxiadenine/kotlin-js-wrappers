import org.gradle.api.Project
import org.gradle.api.publish.PublicationArtifact
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.maven.internal.artifact.FileBasedMavenArtifact
import org.gradle.kotlin.dsl.get
import java.io.File

plugins {
    id("com.jfrog.bintray")
    `maven-publish`
}

val pkgVersionName = "${version(project.name)}-kotlin-${kotlinVersion()}"

bintray {
    user = System.getenv("BINTRAY_USER")
    key = System.getenv("BINTRAY_KEY")
    publish = true
    override = true

    pkg = PackageConfig().apply {
        repo = "kotlin-js-wrappers"
        name = project.name
        vcsUrl = "https://github.com/samgarasx/kotlin-js-wrappers.git"
        setLicenses("Apache-2.0")
        version = VersionConfig().apply {
            name = pkgVersionName
        }
    }

    setPublications("kotlinJsWrapper")
}

publishing {
    publications.create<MavenPublication>("kotlinJsWrapper") {
        groupId = project.group.toString()
        artifactId = project.name
        version = pkgVersionName

        from(components["kotlin"])
    }
}

tasks.named("bintrayUpload") {
    doFirst {
        project.extensions
            .getByName<PublishingExtension>("publishing")
            .publications.withType<MavenPublication>()
            .all { artifact(project.moduleArtifact(name)) }
    }
}

fun Project.moduleArtifact(publicationName: String): PublicationArtifact =
    ModuleArtifact(buildDir.resolve("publications/$publicationName/module.json"))

class ModuleArtifact(moduleFile: File) : FileBasedMavenArtifact(moduleFile) {
    override fun getDefaultExtension() = "module"
}
