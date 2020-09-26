package samples.dropdown

import antd.button.button
import antd.dropdown.*
import antd.menu.*
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

fun RBuilder.placement() {
    styledDiv {
        css { +DropdownStyles.placement }
        div {
            dropdown {
                attrs {
                    overlay = menu
                    placement = "bottomLeft"
                }
                button { +"bottomLeft" }
            }
            dropdown {
                attrs {
                    overlay = menu
                    placement = "bottomCenter"
                }
                button { +"bottomCenter" }
            }
            dropdown {
                attrs {
                    overlay = menu
                    placement = "bottomRight"
                }
                button { +"bottomRight" }
            }
            dropdown {
                attrs {
                    overlay = menu
                    placement = "topLeft"
                }
                button { +"topLeft" }
            }
            dropdown {
                attrs {
                    overlay = menu
                    placement = "topCenter"
                }
                button { +"topCenter" }
            }
            dropdown {
                attrs {
                    overlay = menu
                    placement = "topRight"
                }
                button { +"topRight" }
            }
        }
    }
}
