package samples.dropdown

import antd.dropdown.dropdown
import antd.icon.downOutlined
import antd.menu.menu
import antd.menu.menuItem
import kotlinx.html.classes
import react.RBuilder
import react.buildElement
import react.dom.a
import react.dom.attrs
import styled.css
import styled.styledDiv

private val menu = buildElement {
    menu {
        menuItem {
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
            a {
                attrs {
                    target = "_blank"
                    rel = "noopener noreferrer"
                    href = "http://www.taobao.com/"
                }
                +"2nd menu item"
            }
        }
        menuItem {
            a {
                attrs {
                    target = "_blank"
                    rel = "noopener noreferrer"
                    href = "http://www.tmall.com/"
                }
                +"3rd menu item"
            }
        }
    }
}

fun RBuilder.basic() {
    styledDiv {
        css { +DropdownStyles.basic }
        dropdown {
            attrs.overlay = menu
            a {
                attrs {
                    classes = setOf("ant-dropdown-link")
                    href = "#"
                }
                +"Hover me "
                downOutlined {}
            }
        }
    }
}
