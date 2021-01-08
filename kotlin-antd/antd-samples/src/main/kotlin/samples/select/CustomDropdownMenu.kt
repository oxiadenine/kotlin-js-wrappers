package samples.select

import antd.divider.*
import antd.icon.*
import antd.select.*
import antd.select.option
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.customDropdownMenu() {
    styledDiv {
        css { +SelectStyles.customDropdownMenu }
        select<String, SelectComponent<String>> {
            attrs {
                defaultValue = "lucy"
                style = js { width = 120 }
                dropdownRender = { menu ->
                    buildElement {
                        div {
                            childList.add(menu)
                            divider {
                                attrs.style = js { margin = "4px 0" }
                            }
                            div {
                                attrs.jsStyle = js {
                                    padding = "8px"
                                    cursor = "pointer"
                                }
                                plusOutlined {}
                                +"Add item"
                            }
                        }
                    }
                }

            }
            option {
                attrs.value = "jack"
                +"Jack"
            }
            option {
                attrs.value = "lucy"
                +"Lucy"
            }
        }
    }
}
