import org.gradle.api.Project

fun Project.kotlinVersion() = version("kotlin")
fun Project.kotlinxHtmlVersion() = version("kotlinx-html")

fun Project.wrapperVersion(name: String) = version("kotlin-$name")
fun Project.npmVersion(name: String) = version("kotlin-$name")
    .replaceAfter("-", "")
    .removeSuffix("-")

internal fun Project.version(target: String) = prop("${target}.version")
