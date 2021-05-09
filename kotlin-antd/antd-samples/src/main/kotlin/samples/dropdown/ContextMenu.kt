package samples.dropdown

import antd.dropdown.*
import antd.menu.*
import kotlinx.css.UserSelect
import kotlinx.css.userSelect
import react.*
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
            styledSpan {
                css { userSelect = UserSelect.none }
                +"Right Click on Me"
            }
        }
    }
}
