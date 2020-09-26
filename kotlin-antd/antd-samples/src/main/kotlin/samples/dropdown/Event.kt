package samples.dropdown

import antd.dropdown.*
import antd.icon.*
import antd.menu.*
import antd.message.*
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

private val handleClick = fun(param: ClickParam) {
    message.info("Click on item ${param.key}")
}

private val menu = buildElement {
    menu {
        attrs.onClick = handleClick
        menuItem {
            attrs.key = "0"
            +"1st menu item"
        }
        menuItem {
            attrs.key = "1"
            +"2nd menu item"
        }
        menuItem {
            attrs.key = "3"
            +"3rd menu item"
        }
    }
}

fun RBuilder.event() {
    styledDiv {
        css { +DropdownStyles.event }
        dropdown {
            attrs.overlay = menu
            a {
                attrs {
                    classes = setOf("ant-dropdown-link")
                    href = "#"
                }
                +"Hover me, Click menu item "
                icon {
                    attrs.type = "down"
                }
            }
        }
    }
}
