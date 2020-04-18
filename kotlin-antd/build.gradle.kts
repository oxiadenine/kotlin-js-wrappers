import org.jetbrains.kotlin.utils.addToStdlib.cast

val kotlinVersion: String by project.extra
val kotlinReactVersion: String by project.extra
val kotlinReactDomVersion: String by project.extra

val packageVersions = mapOf(
    "kotlin_version" to kotlinVersion,
    "kotlin_react_version" to kotlinReactVersion,
    "kotlin_react_dom_version" to kotlinReactDomVersion,
    "kotlin_antd_version" to project.version as String,
    "kotlin_moment_version" to project(":kotlin-moment").version as String
)

extra.get("configureKotlinJs").cast<() -> Unit>().invoke()
extra.get("configureBintrayPublishing").cast<() -> Unit>().invoke()
extra.get("configureNpmPublishing").cast<(Map<String, String>) -> Unit>().invoke(packageVersions)

dependencies {
    "implementation"(project(":kotlin-moment"))

    "implementation"("org.jetbrains:kotlin-react:$kotlinReactVersion-kotlin-$kotlinVersion")
    "implementation"("org.jetbrains:kotlin-react-dom:$kotlinReactDomVersion-kotlin-$kotlinVersion")
}
