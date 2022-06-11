import org.gradle.api.Project
import org.gradle.kotlin.dsl.the
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependency
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependencyExtension

fun Project.kotlinWrapperDependency(name: String) =
    "org.jetbrains.kotlin-wrappers:kotlin-$name:${wrapperVersion(name)}"

fun Project.npmPackage(name: String): NpmDependency {
    return dependencies.the<NpmDependencyExtension>()(name, npmVersion(name))
}