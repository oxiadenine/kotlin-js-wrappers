package samples.inputnumber

import antd.inputnumber.*
import react.*
import styled.*

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
