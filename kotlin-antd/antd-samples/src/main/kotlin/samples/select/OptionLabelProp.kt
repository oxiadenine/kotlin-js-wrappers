package samples.select

import antd.select.*
import antd.select.option
import kotlinext.js.*
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

private fun handleChange(value: Array<String>, option: Any) {
    console.log("selected $value")
}

fun RBuilder.optionLabelProp() {
    styledDiv {
        css { +SelectStyles.optionLabelProp }
        select<Array<String>, SelectComponent<Array<String>>> {
            attrs {
                mode = "multiple"
                style = js { width = "100%" }
                placeholder = "select one country"
                defaultValue = arrayOf("china")
                onChange = ::handleChange
                optionLabelProp = "label"

            }
            option {
                attrs {
                    value = "china"
                    label = "China"
                }
                span {
                    attrs.role = "img"
                    attrs["aria-label"] = "China"
                    +"\uD83C\uDDE8\uD83C\uDDF3 "
                }
                +"China (中国)"
            }
            option {
                attrs {
                    value = "usa"
                    label = "USA"
                }
                span {
                    attrs.role = "img"
                    attrs["aria-label"] = "USA"
                    +"\uD83C\uDDFA\uD83C\uDDF8 "
                }
                +"USA (美国)"
            }
            option {
                attrs {
                    value = "japan"
                    label = "Japan"
                }
                span {
                    attrs.role = "img"
                    attrs["aria-label"] = "Japan"
                    +"\uD83C\uDDEF\uD83C\uDDF5 "
                }
                +"Japan (日本)"
            }
            option {
                attrs {
                    value = "korean"
                    label = "Korean"
                }
                span {
                    attrs.role = "img"
                    attrs["aria-label"] = "Korean"
                    +"\uD83C\uDDF0\uD83C\uDDF7 "
                }
                +"Koean (韩国)"
            }
        }
    }
}
