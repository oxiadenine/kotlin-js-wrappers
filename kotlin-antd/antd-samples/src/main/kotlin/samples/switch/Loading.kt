package samples.switch

import antd.switch.switch
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.loading() {
    div("switch-container") {
        attrs.id = "switch-loading"
        div {
            switch {
                attrs {
                    loading = true
                    defaultChecked = true
                }
            }
            br {}
            switch {
                attrs {
                    size = "small"
                    loading = true
                }
            }
        }
    }
}
