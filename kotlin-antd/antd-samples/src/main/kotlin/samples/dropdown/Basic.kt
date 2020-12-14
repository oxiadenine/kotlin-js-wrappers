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
