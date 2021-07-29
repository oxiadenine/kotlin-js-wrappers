package samples.inputnumber

import antd.inputnumber.inputNumber
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

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
