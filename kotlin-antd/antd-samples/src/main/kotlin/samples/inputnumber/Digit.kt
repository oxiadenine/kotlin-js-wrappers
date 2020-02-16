package samples.inputnumber

import antd.inputnumber.inputNumber
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleChange(value: Any?) {
    console.log("changed", value)
}

fun RBuilder.digit() {
    div("input-number-container") {
        attrs.id = "input-number-digit"
        inputNumber {
            attrs {
                min = 0
                max = 10
                step = 0.1
                onChange = ::handleChange
            }
        }
    }
}
