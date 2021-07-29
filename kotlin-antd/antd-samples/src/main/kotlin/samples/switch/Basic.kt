package samples.switch

import antd.switch.SwitchChangeEventHandler
import antd.switch.switch
import react.RBuilder
import styled.css
import styled.styledDiv

private val handleChange: SwitchChangeEventHandler = { checked, _ ->
    console.log("switch to $checked")
}

fun RBuilder.basic() {
    styledDiv {
        css { +SwitchStyles.basic }
        switch {
            attrs {
                defaultChecked = true
                onChange = handleChange
            }
        }
    }
}
