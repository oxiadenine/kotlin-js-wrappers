package samples.dropdown

import antd.dropdown.dropdown
import antd.icon.icon
import antd.menu.menu
import antd.menu.menuItem
import antd.menu.subMenu
import kotlinx.html.classes
import kotlinx.html.id
import react.*
import react.dom.*

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
    div("dropdown-container") {
        attrs.id = "dropdown-sub-menu"
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
