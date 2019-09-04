package samples.checkbox

import antd.checkbox.CheckboxOptionType
import antd.checkbox.CheckboxValueType
import antd.checkbox.checkboxGroup
import kotlinext.js.jsObject
import kotlinx.html.id
import react.*
import react.dom.*

private val plainOptions: Array<CheckboxValueType> = arrayOf("Apple", "Pear", "Orange")
private val options = arrayOf<CheckboxOptionType>(
        jsObject {
            label = "Apple"
            value = "Apple"
        },
        jsObject {
            label = "Pear"
            value = "Pear"
        },
        jsObject {
            label = "Orange"
            value = "Orange"
        }
)
private val optionsWithDisabled = arrayOf<CheckboxOptionType>(
        jsObject {
            label = "Apple"
            value = "Apple"
        },
        jsObject {
            label = "Pear"
            value = "Pear"
        },
        jsObject {
            label = "Orange"
            value = "Orange"
            disabled = true
        }
)

private fun handleChange(checkedValues: Array<CheckboxValueType>) {
    console.log("checked = ", checkedValues)
}

fun RBuilder.group() {
    div("checkbox-container") {
        attrs { id = "checkbox-group" }
        div {
            checkboxGroup {
                attrs {
                    options = plainOptions.unsafeCast<Array<Any>>()
                    defaultValue = arrayOf("Apple")
                    onChange = ::handleChange
                }
            }
            br {}
            br {}
            checkboxGroup {
                attrs {
                    options = options.unsafeCast<Array<Any>>()
                    defaultValue = arrayOf("Pear")
                    onChange = ::handleChange
                }
            }
            br {}
            br {}
            checkboxGroup {
                attrs {
                    options = optionsWithDisabled.unsafeCast<Array<Any>>()
                    disabled = true
                    defaultValue = arrayOf("Apple")
                    onChange = ::handleChange
                }
            }
        }
    }
}
