import org.jetbrains.kotlin.utils.addToStdlib.cast

val kotlinVersion: String by project.extra

val packageVersions = mapOf(
    "kotlin_version" to kotlinVersion,
    "kotlin_moment_version" to project.version as String
)

extra.get("configureKotlinJs").cast<() -> Unit>().invoke()
extra.get("configureBintrayPublishing").cast<() -> Unit>().invoke()
extra.get("configureNpmPublishing").cast<(Map<String, String>) -> Unit>().invoke(packageVersions)
