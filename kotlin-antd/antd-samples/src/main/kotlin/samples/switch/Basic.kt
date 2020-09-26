package samples.switch

import antd.switch.switch
import org.w3c.dom.events.MouseEvent
import react.*
import styled.css
import styled.styledDiv

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
