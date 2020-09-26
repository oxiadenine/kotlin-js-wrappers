package samples.dropdown

import antd.dropdown.*
import antd.menu.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

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
}

fun RBuilder.contextMenu() {
    styledDiv {
        css { +DropdownStyles.contextMenu }
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
