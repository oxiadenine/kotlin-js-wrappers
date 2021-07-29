package samples.dropdown

import antd.MouseEventHandler
import antd.button.button
import antd.dropdown.dropdown
import antd.dropdown.dropdownButton
import antd.icon.downOutlined
import antd.icon.userOutlined
import antd.menu.MenuClickEventHandler
import antd.menu.menu
import antd.menu.menuItem
import antd.message.message
import kotlinext.js.js
import org.w3c.dom.HTMLButtonElement
import react.RBuilder
import react.buildElement
import react.dom.div
import react.key
import styled.css
import styled.styledDiv

private val handleButtonClick: MouseEventHandler<HTMLButtonElement> = {
    message.info("Click on left button.")

    console.log("Click on left button", it)
}

private val handleMenuClick: MenuClickEventHandler = { info ->
    message.info("Click on menu item.")

    console.log("Click on menu item", info)
}

private val menu = buildElement {
    menu {
        attrs.onClick = handleMenuClick
        menuItem {
            attrs.key = "1"
            userOutlined {}
            +"1st menu item"
        }
        menuItem {
            attrs.key = "2"
            userOutlined {}
            +"2nd menu item"
        }
        menuItem {
            attrs.key = "3"
            userOutlined {}
            +"3rd menu item"
        }
    }
}

fun RBuilder.dropdownButton() {
    styledDiv {
        css { +DropdownStyles.dropdownButton }
        div {
            dropdownButton {
                attrs {
                    onClick = handleButtonClick
                    overlay = menu
                }
                +"Dropdown"
            }
            dropdownButton {
                attrs {
                    overlay = menu
                    icon = buildElement {
                        userOutlined {}
                    }
                }
                +"Dropdown"
            }
            dropdownButton {
                attrs {
                    onClick = handleButtonClick
                    overlay = menu
                    disabled = true
                    style = js { marginLeft = 8 }
                }
                +"Dropdown"
            }
            dropdown {
                attrs.overlay = menu
                button {
                    attrs.style = js { marginLeft = 8 }
                    +"Button "
                    downOutlined {}
                }
            }
        }
    }
}
