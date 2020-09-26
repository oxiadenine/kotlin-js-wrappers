package samples.dropdown

import antd.dropdown.dropdown
import antd.icon.icon
import antd.menu.ClickParam
import antd.menu.menu
import antd.menu.menuItem
import kotlinx.html.classes
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

interface OverlayVisibleAppState : RState {
    var visible: Boolean
}

class OverlayVisibleApp : RComponent<RProps, OverlayVisibleAppState>() {
    private fun handleMenuClick(param: ClickParam) {
        if (param.key == "3") {
            setState {
                visible = false
            }
        }
    }

    private val handleVisibleChange = fun (visibleFlag: Boolean?) {
        setState {
            visible = visibleFlag!!
        }
    }

    override fun OverlayVisibleAppState.init() {
        visible = false
    }

    override fun RBuilder.render() {
        val menu = buildElement {
            menu {
                attrs.onClick = ::handleMenuClick
                menuItem {
                    attrs.key = "1"
                    +"Clicking me will not close the menu"
                }
                menuItem {
                    attrs.key = "2"
                    +"Clicking me will not close the menu also"
                }
                menuItem {
                    attrs.key = "3"
                    +"Clicking me will close the menu"
                }
            }
        }

        dropdown {
            attrs {
                overlay = menu
                onVisibleChange = handleVisibleChange
                visible = state.visible
            }
            a {
                attrs {
                    classes = setOf("ant-dropdown-link")
                    href = "#"
                }
                +"Hover me "
                icon {
                    attrs.type = "down"
                }
            }
        }
    }
}

fun RBuilder.overlayVisibleApp() = child(OverlayVisibleApp::class) {}

fun RBuilder.overlayVisible() {
    styledDiv {
        css { +DropdownStyles.overlayVisible }
        overlayVisibleApp()
    }
}
