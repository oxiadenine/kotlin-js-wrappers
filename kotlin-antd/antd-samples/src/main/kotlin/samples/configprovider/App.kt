package samples.configprovider

import react.*
import react.dom.*

class ConfigProviderApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"ConfigProvider" }
        div {
            basic()
        }
    }
}

fun RBuilder.configProviderApp() = child(ConfigProviderApp::class) {}
