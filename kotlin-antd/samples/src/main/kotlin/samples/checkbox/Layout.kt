package samples.checkbox

import antd.checkbox.CheckboxValueType
import antd.checkbox.checkbox
import antd.checkbox.checkboxGroup
import antd.grid.col
import antd.grid.row
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleChange(checkedValues: Array<CheckboxValueType>) {
    console.log("checked = ", checkedValues)
}

fun RBuilder.layout() {
    div("checkbox-container") {
        attrs.id = "checkbox-layout"
        checkboxGroup {
            attrs {
                style = js { width = "100%" }
                onChange = ::handleChange
            }
            row {
                col {
                    attrs.span = 8
                    checkbox {
                        attrs.value = "A"
                        +"A"
                    }
                }
                col {
                    attrs.span = 8
                    checkbox {
                        attrs.value = "B"
                        +"B"
                    }
                }
                col {
                    attrs.span = 8
                    checkbox {
                        attrs.value = "C"
                        +"C"
                    }
                }
                col {
                    attrs.span = 8
                    checkbox {
                        attrs.value = "D"
                        +"D"
                    }
                }
                col {
                    attrs.span = 8
                    checkbox {
                        attrs.value = "E"
                        +"E"
                    }
                }
            }
        }
    }
}
