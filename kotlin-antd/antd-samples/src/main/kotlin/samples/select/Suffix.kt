package samples.select

import antd.icon.*
import antd.select.*
import antd.select.option
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

private val smileIcon = buildElement {
    icon {
        //attrs.type = "smile"
    }
}

private val mehIcon = buildElement {
    mehOutlined {}
}

private val handleChange = { value: String, _: Any ->
    console.log("selected $value")
}

fun RBuilder.suffix() {
    styledDiv {
        css { +SelectStyles.suffix }
        div {
            select<String, SelectComponent<String>> {
                attrs {
                    suffixIcon = smileIcon
                    defaultValue = "lucy"
                    style = js { width = 120 }
                    onChange = handleChange
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
                    suffixIcon = mehIcon
                    defaultValue = "lucy"
                    style = js { width = 120 }
                    disabled = true
                }
                option {
                    attrs.value = "lucy"
                    +"Lucy"
                }
            }
        }
    }
}
