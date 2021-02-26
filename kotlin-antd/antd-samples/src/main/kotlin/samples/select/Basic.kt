package samples.select

import antd.select.*
import antd.select.option
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

private val handleChange = { value: String, _: Any ->
    console.log("selected $value")
}

fun RBuilder.basic() {
    styledDiv {
        css { +SelectStyles.basic }
        div {
            select<String, SelectComponent<String>> {
                attrs {
                    defaultValue = "lucy"
                    onChange = handleChange
                    style = js { width = 120 }
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
                    attrs {
                        value = "disabled"
                        disabled = true
                    }
                    +"Disabled"
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
                }
                option {
                    attrs.value = "lucy"
                    +"Lucy"
                }
            }
            select<String, SelectComponent<String>> {
                attrs {
                    defaultValue = "lucy"
                    style = js { width = 120 }
                    loading = true
                }
                option {
                    attrs.value = "lucy"
                    +"Lucy"
                }
            }
        }
    }
}
