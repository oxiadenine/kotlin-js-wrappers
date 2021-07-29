package samples.inputnumber

import antd.inputnumber.inputNumber
import react.RBuilder
import styled.css
import styled.styledDiv

private fun handleChange(value: Any?) {
    console.log("changed", value)
}

fun RBuilder.basic() {
    styledDiv {
        css { +InputNumberStyles.basic }
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
