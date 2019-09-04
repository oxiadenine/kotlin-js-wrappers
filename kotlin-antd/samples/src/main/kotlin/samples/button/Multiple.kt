package samples.button

import antd.button.button
import antd.dropdown.dropdown
import antd.icon.icon
import antd.menu.*
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleMenuClick(param: ClickParam) {
    console.log("click", param)
}

private val menu = buildElement {
    menu {
        attrs.onClick = ::handleMenuClick
        menuItem {
            attrs.key = "1"
            +"1st item"
        }
        menuItem {
            attrs.key = "2"
            +"2nd item"
        }
        menuItem {
            attrs.key = "3"
            +"3rd item"
        }
    }
}!!

fun RBuilder.multiple() {
    div("button-container") {
        attrs.id = "button-multiple"
        div {
            button {
                attrs.type = "primary"
                +"primary"
            }
            button { +"secondary" }
            dropdown {
                attrs.overlay = menu
                button {
                    +"Actions "
                    icon {
                        attrs.type = "down"
                    }
                }
            }
        }
    }
}
