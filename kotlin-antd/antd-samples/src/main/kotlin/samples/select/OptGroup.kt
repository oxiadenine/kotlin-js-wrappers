package samples.select

import antd.select.*
import kotlinext.js.*
import react.*
import styled.*

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
