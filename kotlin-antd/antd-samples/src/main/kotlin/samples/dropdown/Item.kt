package samples.dropdown

import antd.dropdown.dropdown
import antd.icon.icon
import antd.menu.menu
import antd.menu.menuDivider
import antd.menu.menuItem
import kotlinx.html.classes
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private val menu = buildElement {
    menu {
        menuItem {
            attrs.key = "0"
            a {
                attrs {
                    target = "_blank"
                    rel = "noopener noreferrer"
                    href = "http://www.alipay.com/"
                }
                +"1st menu item"
            }
        }
        menuItem {
            attrs.key = "1"
            a {
                attrs {
                    target = "_blank"
                    rel = "noopener noreferrer"
                    href = "http://www.taobao.com/"
                }
                +"2nd menu item"
            }
        }
        menuDivider {}
        menuItem {
            attrs {
                key = "3"
                disabled = true
            }
            +"3rd menu item（disabled）"
        }
    }
}

fun RBuilder.item() {
    styledDiv {
        css { +DropdownStyles.item }
        dropdown {
            attrs.overlay = menu
            a {
                attrs {
                    classes = setOf("ant-dropdown-link")
                    href = "#"
                }
                +"Hover me "
                icon {
                    attrs.type = "down"
                }
            }
        }
    }
}
