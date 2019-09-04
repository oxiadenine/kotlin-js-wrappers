package samples.configprovider

import antd.button.button
import antd.configprovider.configProvider
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.basic() {
    div("config-provider-container") {
        attrs.id = "config-provider-basic"
        configProvider {
            button { +"My Button" }
        }
    }
}
