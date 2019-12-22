package samples.select

import antd.select.select
import antd.select.LabeledValue
import antd.select.SelectComponent
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleChange(value: LabeledValue, option: Any) {
    console.log(value)  // { key: "lucy", label: "Lucy (101)" }
}

fun RBuilder.labelInValue() {
    div("select-container") {
        attrs.id = "select-label-in-value"
        select<LabeledValue, SelectComponent<LabeledValue>> {
            attrs {
                labelInValue = true
                defaultValue = jsObject { key = "lucy" }
                style = js { width = 120 }
                onChange = ::handleChange
            }
            option {
                attrs.value = "jack"
                +"Jack (100)"
            }
            option {
                attrs.value = "lucy"
                +"Lucy (101)"
            }
        }
    }
}
