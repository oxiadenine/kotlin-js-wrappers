import com.jfrog.bintray.gradle.*
import org.gradle.api.*
import org.gradle.api.publish.*
import org.gradle.kotlin.dsl.*
import org.jetbrains.kotlin.gradle.dsl.*

val Project.kotlin: KotlinJsProjectExtension
    get() = extensions.getByType()

val Project.bintray: BintrayExtension
    get() = extensions.getByType()

val Project.publishing: PublishingExtension
    get() = extensions.getByType()
