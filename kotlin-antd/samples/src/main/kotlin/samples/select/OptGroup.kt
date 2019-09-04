package samples.select

import antd.select.SelectValue
import antd.select.optGroup
import antd.select.option
import antd.select.select
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleChange(value: SelectValue, option: Any) {
    console.log("selected $value")
}

fun RBuilder.optGroup() {
    div("select-container") {
        attrs.id = "select-optgroup"
        select {
            attrs {
                defaultValue = "lucy"
                style = js { width = 200 }
                onChange = ::handleChange
            }
            optGroup {
                attrs.label = "Manager"
                option {
                    attrs.value = "jack"
                    +"Jack"
                }
                option {
                    attrs.value = "lucy"
                    +"Lucy"
                }
            }
            optGroup {
                attrs.label = "Engineer"
                option {
                    attrs.value = "yiminghe"
                    +"Yiminghe"
                }
            }
        }
    }
}
