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
        menuItem {
            attrs.key = "0"
            a {
                attrs.href = "http://www.alipay.com/"
                +"1st menu item"
            }
        }
        menuItem {
            attrs.key = "1"
            a {
                attrs.href = "http://www.taobao.com/"
                +"2nd menu item"
            }
        }
        divider {}
        menuItem {
            attrs.key = "3"
            +"3rd menu item"
        }
    }
}

fun RBuilder.trigger() {
    styledDiv {
        css { +DropdownStyles.trigger }
        dropdown {
            attrs {
                overlay = menu
                trigger = arrayOf("click")
            }
            a {
                attrs {
                    classes = setOf("ant-dropdown-link")
                    href = "#"
                }
                +"Click me "
                downOutlined {}
            }
        }
    }
}
