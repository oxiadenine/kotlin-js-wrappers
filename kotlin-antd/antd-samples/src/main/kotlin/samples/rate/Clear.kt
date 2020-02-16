package samples.rate

import antd.rate.rate
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.clear() {
    div("rate-container") {
        attrs.id = "rate-clear"
        div {
            rate {
                attrs.defaultValue = 3
            }
            +"allowClear: true"
            br {}
            rate {
                attrs {
                    allowClear = false
                    defaultValue = 3
                }
            }
            +"allowClear: false"
        }
    }
}
