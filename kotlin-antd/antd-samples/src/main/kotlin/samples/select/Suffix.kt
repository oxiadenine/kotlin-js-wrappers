package samples.select

import antd.icon.icon
import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private val smileIcon = buildElement {
    icon {
        attrs.type = "smile"
    }
}

private val mehIcon = buildElement {
    icon {
        attrs.type = "meh"
    }
}

private fun handleChange(value: String, option: Any) {
    console.log("selected $value")
}

fun RBuilder.suffix() {
    div("select-container") {
        attrs.id = "select-suffix"
        div {
            select<String, SelectComponent<String>> {
                attrs {
                    suffixIcon = smileIcon
                    defaultValue = "lucy"
                    style = js { width = 120 }
                    onChange = ::handleChange
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
