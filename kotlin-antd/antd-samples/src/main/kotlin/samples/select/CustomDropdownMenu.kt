package samples.select

import antd.divider.divider
import antd.icon.icon
import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.customDropdownMenu() {
    div("select-container") {
        attrs.id = "select-custom-dropdown-menu"
        select<String, SelectComponent<String>> {
            attrs {
                defaultValue = "lucy"
                style = js { width = 120 }
                dropdownRender = { menu, _ ->
                    buildElement {
                        div {
                            childList.add(menu!!)
                            divider {
                                attrs.style = js { margin = "4px 0" }
                            }
                            div {
                                attrs.jsStyle = js {
                                    padding = "8px"
                                    cursor = "pointer"
                                }
                                icon {
                                    attrs.type = "plus"
                                }
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
