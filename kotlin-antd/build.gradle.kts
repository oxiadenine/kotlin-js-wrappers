version = "3.20.3-pre.3"

apply(plugin = "kotlin-js-wrapper")
apply(plugin = "kotlin-js-wrapper-publish")

dependencies {
    "implementation"(project(":kotlin-moment"))

    "implementation"("org.jetbrains:kotlin-react:$kotlinReactVersion-kotlin-$kotlinVersion")
    "implementation"("org.jetbrains:kotlin-react-dom:$kotlinReactDomVersion-kotlin-$kotlinVersion")
}
