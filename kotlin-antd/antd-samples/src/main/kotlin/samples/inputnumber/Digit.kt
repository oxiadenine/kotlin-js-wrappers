package samples.inputnumber

import antd.inputnumber.*
import react.*
import styled.*

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
