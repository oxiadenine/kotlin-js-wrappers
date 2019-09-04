pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "kotlin2js") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
        }
    }
}

rootProject.name = "kotlin-js-wrappers"

include(":kotlin-antd", ":kotlin-antd:samples")
include(":kotlin-moment", ":kotlin-moment:samples")
include(":kotlin-react-intl", ":kotlin-react-intl:samples")
include(":kotlin-react-responsive", ":kotlin-react-responsive:samples")
