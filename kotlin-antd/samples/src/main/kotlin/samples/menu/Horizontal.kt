package samples.menu

import antd.icon.icon
import antd.menu.*
import kotlinx.html.id
import react.*
import react.dom.*

interface HorizontalAppState : RState {
    var current: String
}

class HorizontalApp : RComponent<RProps, HorizontalAppState>() {
    private val handleClick = fun (param: ClickParam) {
        console.log("click ", param)

        setState {
            current = param.key
        }
    }

    override fun HorizontalAppState.init() {
        current = "mail"
    }

    override fun RBuilder.render() {
        menu {
            attrs {
                onClick = handleClick
                selectedKeys = arrayOf(state.current)
                mode = "horizontal"
            }
            menuItem {
                attrs.key = "mail"
                icon {
                    attrs.type = "mail"
                }
                +"Navigation One"
            }
            menuItem {
                attrs {
                    key = "app"
                    disabled = true
                }
                icon {
                    attrs.type = "appstore"
                }
                +"Navigation Two"
            }
            subMenu {
                attrs {
                    title = buildElement {
                        span("submenu-title-wrapper") {
                            icon {
                                attrs.type = "setting"
                            }
                            +"Navigation Three - Submenu"
                        }
                    }
                }
                menuItemGroup {
                    attrs.title = "Item 1"
                    menuItem {
                        attrs.key = "setting:1"
                        +"Option 1"
                    }
                    menuItem {
                        attrs.key = "setting:2"
                        +"Option 2"
                    }
                }
                menuItemGroup {
                    attrs.title = "Item 2"
                    menuItem {
                        attrs.key = "setting:3"
                        +"Option 3"
                    }
                    menuItem {
                        attrs.key = "setting:4"
                        +"Option 4"
                    }
                }
            }
            menuItem {
                attrs.key = "aliplay"
                a {
                    attrs {
                        href = "https://ant.design"
                        target = "_blank"
                        rel = "noopener noreferrer"
                    }
                    +"Navigation Four - Link"
                }
            }
        }
    }
}

fun RBuilder.horizontalApp() = child(HorizontalApp::class) {}

fun RBuilder.horizontal() {
    div("menu-container") {
        attrs.id = "menu-horizontal"
        horizontalApp()
    }
}
