package samples.dropdown

import antd.dropdown.dropdown
import antd.menu.menu
import antd.menu.menuItem
import kotlinx.css.UserSelect
import kotlinx.css.userSelect
import react.RBuilder
import react.buildElement
import react.key
import styled.css
import styled.styledDiv
import styled.styledSpan

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
