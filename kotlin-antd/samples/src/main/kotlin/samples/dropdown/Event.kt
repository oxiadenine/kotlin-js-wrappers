package samples.dropdown

import antd.dropdown.dropdown
import antd.icon.icon
import antd.menu.*
import antd.message.message
import kotlinx.html.classes
import kotlinx.html.id
import react.*
import react.dom.*

private val handleClick = fun (param: ClickParam) {
    message.info("Click on item ${param.key}")
}

private val menu = buildElement {
    menu {
        attrs.onClick = handleClick
        menuItem {
            attrs.key = "0"
            +"1st menu item"
        }
        menuItem {
            attrs.key = "1"
            +"2nd menu item"
        }
        menuItem {
            attrs.key = "3"
            +"3rd menu item"
        }
    }
}!!

fun RBuilder.event() {
    div("dropdown-container") {
        attrs.id = "dropdown-event"
        dropdown {
            attrs.overlay = menu
            a {
                attrs {
                    classes = setOf("ant-dropdown-link")
                    href = "#"
                }
                +"Hover me, Click menu item "
                icon {
                    attrs.type = "down"
                }
            }
        }
    }
}
