import org.jetbrains.kotlin.utils.addToStdlib.cast

typealias ApplyKotlinJSFunc = () -> Unit
typealias ConfigurePublishingFunc = (String) -> Unit

val kotlinMomentVersion: String by project.extra

extra.get("applyKotlinJS").cast<ApplyKotlinJSFunc>().invoke()
extra.get("configurePublishing").cast<ConfigurePublishingFunc>().invoke(kotlinMomentVersion)
