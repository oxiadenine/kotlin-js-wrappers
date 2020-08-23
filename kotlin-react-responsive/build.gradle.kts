version = "7.0.0-pre.2"

apply(plugin = "kotlin-js")
apply(plugin = "bintray-publish")

dependencies {
    "implementation"("org.jetbrains:kotlin-react:$kotlinReactVersion-kotlin-$kotlinVersion")
}
