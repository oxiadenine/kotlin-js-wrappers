package samples.checkbox

import antd.checkbox.checkbox
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.disabled() {
    div("checkbox-container") {
        attrs.id = "checkbox-disabled"
        div {
            checkbox {
                attrs {
                    defaultChecked = false
                    disabled = true
                }
            }
            br {}
            checkbox {
                attrs {
                    defaultChecked = true
                    disabled = true
                }
            }
        }
    }
}
