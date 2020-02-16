package samples.dropdown

import antd.dropdown.dropdown
import antd.menu.menu
import antd.menu.menuItem
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private val menu = buildElement {
    menu {
        menuItem {
            attrs.key = "1"
            +"1st menu item"
        }
        menuItem {
            attrs.key = "2"
            +"2nd menu item"
        }
        menuItem {
            attrs.key = "3"
            +"3rd menu item"
        }
    }
}!!

fun RBuilder.contextMenu() {
    div("dropdown-container") {
        attrs.id = "dopdown-context-menu"
        dropdown {
            attrs {
                overlay = menu
                trigger = arrayOf("contextMenu")
            }
            span {
                attrs.jsStyle = js { userSelect = "none" }
                +"Right Click on Me"
            }
        }
    }
}
