package samples.dropdown

import antd.dropdown.dropdown
import antd.icon.downOutlined
import antd.menu.MenuClickEventHandler
import antd.menu.menu
import antd.menu.menuItem
import antd.message.message
import kotlinx.html.classes
import react.RBuilder
import react.buildElement
import react.dom.a
import react.dom.attrs
import react.key
import styled.css
import styled.styledDiv

private val handleClick: MenuClickEventHandler = { info ->
    message.info("Click on item ${info.key}")
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
                downOutlined {}
            }
        }
    }
}
