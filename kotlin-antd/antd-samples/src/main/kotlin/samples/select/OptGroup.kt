package samples.select

import antd.select.*
import antd.select.optGroup
import antd.select.option
import kotlinext.js.js
import react.*
import styled.css
import styled.styledDiv

private fun handleChange(value: String, option: Any) {
    console.log("selected $value")
}

fun RBuilder.optGroup() {
    styledDiv {
        css { +SelectStyles.optgroup }
        select<String, SelectComponent<String>> {
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
