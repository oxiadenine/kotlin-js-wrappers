package samples.inputnumber

import antd.inputnumber.inputNumber
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleChange(value: Any?) {
    console.log("changed", value)
}

fun RBuilder.size() {
    div("input-number-container") {
        attrs.id = "input-number-size"
        div {
            inputNumber {
                attrs {
                    size = "large"
                    min = 1
                    max = 100000
                    defaultValue = 3
                    onChange = ::handleChange
                }
            }
            inputNumber {
                attrs {
                    min = 1
                    max = 100000
                    defaultValue = 3
                    onChange = ::handleChange
                }
            }
            inputNumber {
                attrs {
                    size = "small"
                    min = 1
                    max = 100000
                    defaultValue = 3
                    onChange = ::handleChange
                }
            }
        }
    }
}
