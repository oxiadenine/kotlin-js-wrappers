import org.gradle.api.Project

fun Project.kotlinVersion() = version("kotlin")

fun Project.wrapperVersion(name: String) = version("kotlin-$name")
fun Project.npmVersion(name: String) = "^${version("kotlin-$name")}"
    .replaceAfter("-", "")
    .removeSuffix("-")

fun Project.version(target: String) = property("${target}.version") as String