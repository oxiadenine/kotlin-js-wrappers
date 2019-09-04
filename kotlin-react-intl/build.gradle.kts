import org.jetbrains.kotlin.utils.addToStdlib.cast

typealias ApplyKotlinJSFunc = () -> Unit
typealias ConfigurePublishingFunc = (String) -> Unit

val kotlinVersion: String by project.extra
val kotlinReactVersion: String by project.extra
val kotlinReactIntlVersion: String by project.extra

extra.get("applyKotlinJS").cast<ApplyKotlinJSFunc>().invoke()
extra.get("configurePublishing").cast<ConfigurePublishingFunc>().invoke(kotlinReactIntlVersion)

dependencies {
    "implementation"("org.jetbrains:kotlin-react:$kotlinReactVersion-kotlin-$kotlinVersion")
}
