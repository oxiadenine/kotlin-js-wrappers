package samples.checkbox

import antd.checkbox.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

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
    styledDiv {
        css { +CheckboxStyles.group }
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
