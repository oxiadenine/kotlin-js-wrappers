package samples.checkbox

import antd.checkbox.CheckboxChangeEvent
import antd.checkbox.checkbox
import react.RBuilder
import styled.css
import styled.styledDiv

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
