package samples.checkbox

import antd.checkbox.CheckboxChangeEvent
import antd.checkbox.checkbox
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleChange(event: CheckboxChangeEvent) {
    console.log("checked = ${event.target.checked}")
}

fun RBuilder.basic() {
    div("checkbox-container") {
        attrs.id = "checkbox-basic"
        checkbox {
            attrs.onChange = ::handleChange
            +"Checkbox"
        }
    }
}
