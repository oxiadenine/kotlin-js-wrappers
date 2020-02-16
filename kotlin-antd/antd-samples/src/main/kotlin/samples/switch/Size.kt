package samples.switch

import antd.switch.switch
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.size() {
    div("switch-container") {
        attrs.id = "switch-size"
        div {
            switch {
                attrs.defaultChecked = true
            }
            br {}
            switch {
                attrs {
                    size = "small"
                    defaultChecked = true
                }
            }
        }
    }
}
