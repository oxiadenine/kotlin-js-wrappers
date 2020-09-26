package samples.dropdown

import antd.dropdown.*
import antd.icon.*
import antd.menu.*
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

private val menu = buildElement {
    menu {
        menuItem { +"1st menu item" }
        menuItem { +"2nd menu item" }
        subMenu {
            attrs.title = "sub menu"
            menuItem { +"3rd menu item" }
            menuItem { +"4th menu item" }
        }
        subMenu {
            attrs {
                title = "disabled sub menu"
                disabled = true
            }
            menuItem { +"5d menu item" }
            menuItem { +"6th menu item" }
        }
    }
}

fun RBuilder.subMenu() {
    styledDiv {
        css { +DropdownStyles.subMenu }
        dropdown {
            attrs.overlay = menu
            a {
                attrs {
                    classes = setOf("ant-dropdown-link")
                    href = "#"
                }
                +"Cascading menu "
                icon {
                    attrs.type = "down"
                }
            }
        }
    }
}
