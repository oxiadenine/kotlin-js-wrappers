import org.jetbrains.kotlin.utils.addToStdlib.cast

typealias ApplyKotlinJSFunc = () -> Unit
typealias ConfigurePublishingFunc = (String) -> Unit

val kotlinVersion: String by project.extra
val kotlinReactDomVersion: String by project.extra
val kotlinAntdVersion: String by project.extra

extra.get("applyKotlinJS").cast<ApplyKotlinJSFunc>().invoke()
extra.get("configurePublishing").cast<ConfigurePublishingFunc>().invoke(kotlinAntdVersion)

dependencies {
    "implementation"(project(":kotlin-moment"))

    "implementation"("org.jetbrains:kotlin-react-dom:$kotlinReactDomVersion-kotlin-$kotlinVersion")
}
