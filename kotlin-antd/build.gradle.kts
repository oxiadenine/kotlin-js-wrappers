import org.jetbrains.kotlin.utils.addToStdlib.cast

val kotlinVersion: String by project.extra
val kotlinReactVersion: String by project.extra
val kotlinReactDomVersion: String by project.extra

extra.get("configureKotlinJs").cast<() -> Unit>().invoke()
extra.get("configureBintrayPublishing").cast<() -> Unit>().invoke()

dependencies {
    "implementation"(project(":kotlin-moment"))

    "implementation"("org.jetbrains:kotlin-react:$kotlinReactVersion-kotlin-$kotlinVersion")
    "implementation"("org.jetbrains:kotlin-react-dom:$kotlinReactDomVersion-kotlin-$kotlinVersion")
}
