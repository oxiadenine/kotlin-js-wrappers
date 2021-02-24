plugins {
    kotlin("js")
    id("wrapper-publish")
}

dependencies {
    implementation(project(":kotlin-moment"))

    implementation(wrapperDependency("react"))
    implementation(wrapperDependency("react-dom"))
}

tasks.register("generateIconFiles") {
    doLast {
        val iconDirPath = "${project.projectDir}/src/main/kotlin/antd/icon"

        val iconsFile = file("$iconDirPath/Icons.kt")
        val iconsDslFile = file("$iconDirPath/IconsDsl.kt")

        iconsFile.writeText("""
            package antd.icon

            import react.*

            external interface AntdIconClass : RClass<AntdIconProps> {
                var default: Any
            }

            external interface AntdIconProps : IconBaseProps, RProps {
                override var twoToneColor: TwoToneColor?
            }
        """.trimIndent())
        iconsFile.appendText("\n\n")

        iconsDslFile.writeText("""
            package antd.icon

            import kotlinext.js.*
            import react.*
        """.trimIndent())
        iconsDslFile.appendText("\n\n")

        val jsModulesDirPath = "${rootProject.buildDir}/js/node_modules"
        val antdIconsDirPath = "@ant-design/icons"

        file("$jsModulesDirPath/$antdIconsDirPath")
            .list { _, name -> name.endsWith(".d.ts") }
            ?.forEach {
                val iconName = it.removeSuffix(".d.ts").decapitalize()

                iconsFile.appendText("""
                    @JsModule("$antdIconsDirPath/${iconName.capitalize()}")
                    @JsNonModule
                    external val ${iconName.plus("Icon")}: AntdIconClass
                """.trimIndent())
                iconsFile.appendText("\n\n")

                iconsDslFile.appendText("""
                    fun RBuilder.$iconName(handler: RHandler<AntdIconProps>) =
                        child(${iconName.plus("Icon")}.default, jsObject {}, handler)
                """.trimIndent())
                iconsDslFile.appendText("\n\n")
            }
    }
}
