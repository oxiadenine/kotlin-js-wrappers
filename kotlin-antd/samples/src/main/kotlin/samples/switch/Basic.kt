package samples.switch

import antd.switch.switch
import kotlinx.html.id
import org.w3c.dom.events.MouseEvent
import react.*
import react.dom.*

private fun handleChange(checked: Boolean, event: MouseEvent) {
    console.log("switch to $checked")
}

fun RBuilder.basic() {
    div("switch-container") {
        attrs.id = "switch-basic"
        switch {
            attrs {
                defaultChecked = true
                onChange = ::handleChange
            }
        }
    }
}
