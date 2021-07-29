package samples.select

import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import kotlinext.js.js
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

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
