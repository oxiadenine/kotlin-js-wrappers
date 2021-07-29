package samples.inputnumber

import antd.inputnumber.inputNumber
import react.RBuilder
import styled.css
import styled.styledDiv

private fun handleChange(value: Any?) {
    console.log("changed", value)
}

fun RBuilder.digit() {
    styledDiv {
        css { +InputNumberStyles.digit }
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
