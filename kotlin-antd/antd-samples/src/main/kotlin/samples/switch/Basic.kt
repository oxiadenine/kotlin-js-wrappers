package samples.switch

import antd.switch.*
import org.w3c.dom.events.*
import react.*
import styled.*

private fun handleChange(checked: Boolean, event: MouseEvent) {
    console.log("switch to $checked")
}

fun RBuilder.basic() {
    styledDiv {
        css { +SwitchStyles.basic }
        switch {
            attrs {
                defaultChecked = true
                onChange = ::handleChange
            }
        }
    }
}
