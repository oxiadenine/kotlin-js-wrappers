package samples.select

import antd.select.LabeledValue
import antd.select.SelectComponent
import antd.select.select
import kotlinext.js.js
import kotlinext.js.jsObject
import react.RBuilder
import react.dom.option
import styled.css
import styled.styledDiv

private val handleChange = { value: LabeledValue, _: Any ->
    console.log(value)  // { key: "lucy", label: "Lucy (101)" }
}

fun RBuilder.labelInValue() {
    styledDiv {
        css { +SelectStyles.labelInValue }
        select<LabeledValue, SelectComponent<LabeledValue>> {
            attrs {
                labelInValue = true
                defaultValue = jsObject { key = "lucy" }
                style = js { width = 120 }
                onChange = handleChange
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
