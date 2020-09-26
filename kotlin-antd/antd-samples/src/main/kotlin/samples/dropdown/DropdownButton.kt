package samples.dropdown

import antd.MouseEventHandler
import antd.button.button
import antd.dropdown.dropdown
import antd.dropdown.dropdownButton
import antd.icon.icon
import antd.menu.ClickParam
import antd.menu.menu
import antd.menu.menuItem
import antd.message.message
import kotlinext.js.js
import org.w3c.dom.HTMLButtonElement
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private val handleButtonClick: MouseEventHandler<HTMLButtonElement> = {
    message.info("Click on left button.")

    console.log("Click on left button", it)
}

private fun handleMenuClick(param: ClickParam) {
    message.info("Click on menu item.")

    console.log("Click on menu item", param)
}

private val menu = buildElement {
    menu {
        attrs.onClick = ::handleMenuClick
        menuItem {
            attrs.key = "1"
            icon {
                attrs.type = "user"
            }
            +"1st menu item"
        }
        menuItem {
            attrs.key = "2"
            icon {
                attrs.type = "user"
            }
            +"2nd menu item"
        }
        menuItem {
            attrs.key = "3"
            icon {
                attrs.type = "user"
            }
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
                        icon {
                            attrs.type = "user"
                        }
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
                    icon {
                        attrs.type = "down"
                    }
                }
            }
        }
    }
}
