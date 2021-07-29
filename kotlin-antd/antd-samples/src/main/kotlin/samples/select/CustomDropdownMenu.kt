package samples.select

import antd.divider.divider
import antd.icon.plusOutlined
import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import kotlinext.js.js
import kotlinx.css.Cursor
import kotlinx.css.cursor
import kotlinx.css.padding
import kotlinx.css.px
import react.RBuilder
import react.buildElement
import react.dom.div
import styled.css
import styled.styledDiv

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
                            styledDiv {
                                css {
                                    padding(8.px)
                                    cursor = Cursor.pointer
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
