import org.jetbrains.kotlin.utils.addToStdlib.cast

typealias ApplyKotlinJSFunc = () -> Unit
typealias ConfigurePublishingFunc = (String) -> Unit

val kotlinVersion: String by project.extra
val kotlinReactVersion: String by project.extra
val kotlinReactResponsiveVersion: String by project.extra

extra.get("applyKotlinJS").cast<ApplyKotlinJSFunc>().invoke()
extra.get("configurePublishing").cast<ConfigurePublishingFunc>().invoke(kotlinReactResponsiveVersion)

dependencies {
    "implementation"("org.jetbrains:kotlin-react:$kotlinReactVersion-kotlin-$kotlinVersion")
}
