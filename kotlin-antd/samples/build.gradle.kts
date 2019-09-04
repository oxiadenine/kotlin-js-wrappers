import org.jetbrains.kotlin.utils.addToStdlib.cast

typealias ApplyKotlinJSFunc = () -> Unit

val kotlinVersion: String by project.extra
val kotlinReactDomVersion: String by project.extra
val kotlinMomentVersion: String by project.extra

extra.get("applyKotlinJS").cast<ApplyKotlinJSFunc>().invoke()

dependencies {
    "implementation"(project(":kotlin-antd"))
    "implementation"(project(":kotlin-moment"))

    "implementation"("org.jetbrains:kotlin-react-dom:$kotlinReactDomVersion-kotlin-$kotlinVersion")
}
