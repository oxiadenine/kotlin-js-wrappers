rootProject.name = "kotlin-js-wrappers"

pluginManagement {
    resolutionStrategy {
        plugins {
            val kotlinVersion = extra["kotlin.version"] as String

            kotlin("js") version kotlinVersion
        }
    }
}

include(":kotlin-antd", ":kotlin-antd:antd-samples")
include(":kotlin-moment", ":kotlin-moment:moment-samples")
include(":kotlin-react-intl", ":kotlin-react-intl:react-intl-samples")
include(":kotlin-react-responsive", ":kotlin-react-responsive:react-responsive-samples")
include(":kotlin-uikit", ":kotlin-uikit:uikit-samples")
