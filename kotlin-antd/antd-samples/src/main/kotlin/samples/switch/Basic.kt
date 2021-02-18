package samples.switch

import antd.switch.*
import react.*
import styled.*

private val handleChange: SwitchChangeEventHandler =  { checked, _ ->
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
