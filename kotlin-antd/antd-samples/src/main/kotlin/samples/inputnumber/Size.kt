package samples.inputnumber

import antd.inputnumber.*
import react.*
import react.dom.*
import styled.*

private fun handleChange(value: Any?) {
    console.log("changed", value)
}

fun RBuilder.size() {
    styledDiv {
        css { +InputNumberStyles.size }
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
