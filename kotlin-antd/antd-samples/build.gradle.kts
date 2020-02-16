import org.jetbrains.kotlin.utils.addToStdlib.cast

extra.get("configureKotlinJs").cast<() -> Unit>().invoke()
extra.get("configureSamples").cast<() -> Unit>().invoke()

dependencies {
    "implementation"(project(":kotlin-moment"))
}
