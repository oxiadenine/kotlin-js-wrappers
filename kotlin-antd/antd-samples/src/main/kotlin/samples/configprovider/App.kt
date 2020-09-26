package samples.configprovider

import react.*
import react.dom.*
import styled.StyleSheet
import styled.css
import styled.styledDiv

object ConfigProviderStyles : StyleSheet("config-provider", isStatic = true) {
    val container by css {}
    val basic by css {}
}

class ConfigProviderApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"ConfigProvider" }
        styledDiv {
            css { +ConfigProviderStyles.container }
            basic()
        }
    }
}

fun RBuilder.configProviderApp() = child(ConfigProviderApp::class) {}
