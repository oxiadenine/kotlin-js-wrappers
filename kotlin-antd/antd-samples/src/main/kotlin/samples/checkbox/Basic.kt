package samples.checkbox

import antd.checkbox.*
import react.*
import styled.*

private fun handleChange(event: CheckboxChangeEvent) {
    console.log("checked = ${event.target.checked}")
}

fun RBuilder.basic() {
    styledDiv {
        css { +CheckboxStyles.basic }
        checkbox {
            attrs.onChange = ::handleChange
            +"Checkbox"
        }
    }
}
