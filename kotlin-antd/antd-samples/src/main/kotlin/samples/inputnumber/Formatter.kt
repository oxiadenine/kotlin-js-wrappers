package samples.inputnumber

import antd.inputnumber.inputNumber
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleChange(value: Any?) {
    console.log("changed", value)
}

fun RBuilder.formatter() {
    div("input-number-container") {
        attrs.id = "input-number-formatter"
        div {
            inputNumber {
                attrs {
                    defaultValue = 1000
                    formatter = { value ->
                        "$ $value".replace(Regex("\\B(?=(\\d{3})+(?!\\d))"), ",")
                    }
                    parser = { displayValue ->
                        displayValue!!.replace(Regex("\\\$\\s?|(,*)"), "")
                    }
                    onChange = ::handleChange
                }
            }
            inputNumber {
                attrs {
                    defaultValue = 100
                    min = 0
                    max = 100
                    formatter = { value -> "$value%" }
                    parser = { displayValue ->
                        displayValue!!.replace("%", "")
                    }
                    onChange = ::handleChange
                }
            }
        }
    }
}
