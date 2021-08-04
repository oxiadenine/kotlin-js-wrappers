plugins {
    `maven-publish`
    signing
}

signing {
    setRequired({
        gradle.taskGraph.hasTask("publish")
    })

    sign(configurations.archives.get())
}

configure<PublishingExtension> {
    publications.create<MavenPublication>("kotlinJsWrapper") {
        groupId = project.group.toString()
        artifactId = project.name
        version = "${version(project.name)}-kotlin-${kotlinVersion()}"

        artifact(tasks.getByName<Zip>("jsLegacySourcesJar"))

        from(components["kotlin"])

        pom {
            name.set(project.name)
            description.set(project.description)
            url.set("https://github.com/sunlandx/kotlin-js-wrappers")

            licenses {
                license {
                    name.set("Apache License, Version 2.0")
                    url.set("https://github.com/sunlandx/kotlin-js-wrappers/blob/master/LICENSE")
                }
            }

            developers {
                developer {
                    id.set("samgarasx")
                    name.set("Samuel Garcia")
                    email.set("samgarasx@gmail.com")
                }
            }

            scm {
                connection.set("scm:git:git://github.com/sunlandx/kotlin-js-wrappers.git")
                developerConnection.set("scm:git:git@github.com:sunlandx/kotlin-js-wrappers.git")
                url.set("https://github.com/sunlandx/kotlin-js-wrappers")
            }
        }
    }

    repositories {
        maven {
            name = "MavenCentral"
            url = uri("https://s01.oss.sonatype.org/content/repositories/releases")
            credentials {
                username = System.getenv("SONATYPE_USERNAME")
                password = System.getenv("SONATYPE_PASSWORD")
            }
        }
    }
}
