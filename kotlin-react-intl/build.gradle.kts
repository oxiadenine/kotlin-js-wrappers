version = "5.8.1-pre.3"

apply(plugin = "kotlin-js")
apply(plugin = "bintray-publish")

dependencies {
    "implementation"("org.jetbrains:kotlin-react:$kotlinReactVersion-kotlin-$kotlinVersion")
}
