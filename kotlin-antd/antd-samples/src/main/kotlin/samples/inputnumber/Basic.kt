package samples.inputnumber

import antd.inputnumber.inputNumber
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleChange(value: Any?) {
    console.log("changed", value)
}

fun RBuilder.basic() {
    div("input-number-container") {
        attrs.id = "input-number-basic"
        inputNumber {
            attrs {
                min = 1
                max = 10
                defaultValue = 3
                onChange = ::handleChange
            }
        }
    }
}
