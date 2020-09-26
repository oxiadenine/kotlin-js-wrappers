package samples.button

import antd.button.button
import antd.dropdown.*
import antd.icon.*
import antd.menu.*
import react.*
import react.dom.*
import styled.*

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
}

fun RBuilder.multiple() {
    styledDiv {
        css { +ButtonStyles.multiple }
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
