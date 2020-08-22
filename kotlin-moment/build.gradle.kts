import org.jetbrains.kotlin.utils.addToStdlib.cast

val kotlinVersion: String by project.extra

extra.get("configureKotlinJs").cast<() -> Unit>().invoke()
extra.get("configureBintrayPublishing").cast<() -> Unit>().invoke()
