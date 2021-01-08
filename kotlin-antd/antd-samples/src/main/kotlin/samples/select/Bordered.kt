package samples.select

import antd.select.*
import antd.select.option
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.bordered() {
    styledDiv {
        css { +SelectStyles.bordered }
        div {
            select<String, SelectComponent<String>> {
                attrs {
                    defaultValue = "lucy"
                    style = js { width = 120 }
                    bordered = false
                }
                option {
                    attrs.value = "jack"
                    +"Jack"
                }
                option {
                    attrs.value = "lucy"
                    +"Lucy"
                }
                option {
                    attrs.value = "yiminghe"
                    +"Yiminghe"
                }
            }
            select<String, SelectComponent<String>> {
                attrs {
                    defaultValue = "lucy"
                    style = js { width = 120 }
                    disabled = true
                    bordered = false
                }
                option {
                    attrs.value = "lucy"
                    +"Lucy"
                }
            }
        }
    }
}
