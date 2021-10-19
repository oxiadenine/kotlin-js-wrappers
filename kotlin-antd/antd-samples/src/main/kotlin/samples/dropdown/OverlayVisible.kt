package samples.dropdown

import antd.dropdown.dropdown
import antd.icon.downOutlined
import antd.menu.MenuClickEventHandler
import antd.menu.menu
import antd.menu.menuItem
import kotlinx.html.classes
import react.*
import react.dom.a
import react.dom.attrs
import styled.css
import styled.styledDiv

external interface OverlayVisibleAppState : State {
    var visible: Boolean
}

class OverlayVisibleApp : RComponent<Props, OverlayVisibleAppState>() {
    private val handleMenuClick: MenuClickEventHandler = { info ->
        if (info.key == "3") {
            setState {
                visible = false
            }
        }
    }

    private val handleVisibleChange = fun(visibleFlag: Boolean?) {
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
                attrs.onClick = handleMenuClick
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
                downOutlined {}
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
