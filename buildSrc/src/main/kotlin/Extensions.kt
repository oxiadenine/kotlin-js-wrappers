import com.jfrog.bintray.gradle.BintrayExtension
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension

val Project.kotlin: KotlinJsProjectExtension
    get() = extensions.getByType()

val Project.bintray: BintrayExtension
    get() = extensions.getByType()

val Project.publishing: PublishingExtension
    get() = extensions.getByType()
