package samples.dropdown

import antd.button.button
import antd.dropdown.dropdown
import antd.menu.menu
import antd.menu.menuItem
import kotlinx.html.id
import react.*
import react.dom.*

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
    div("dropdown-container") {
        attrs.id = "dopdown-placement"
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
