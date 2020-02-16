pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "kotlin-js-wrappers"

include(":kotlin-antd", ":kotlin-antd:antd-samples")
include(":kotlin-moment", ":kotlin-moment:moment-samples")
include(":kotlin-react-intl", ":kotlin-react-intl:react-intl-samples")
include(":kotlin-react-responsive", ":kotlin-react-responsive:react-responsive-samples")
