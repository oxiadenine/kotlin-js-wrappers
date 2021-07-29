package samples.select

import antd.select.SelectComponent
import antd.select.optGroup
import antd.select.option
import antd.select.select
import kotlinext.js.js
import react.RBuilder
import styled.css
import styled.styledDiv

private val handleChange = { value: String, _: Any ->
    console.log("selected $value")
}

fun RBuilder.optGroup() {
    styledDiv {
        css { +SelectStyles.optgroup }
        select<String, SelectComponent<String>> {
            attrs {
                defaultValue = "lucy"
                style = js { width = 200 }
                onChange = handleChange
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
