package samples.menu

import antd.icon.appstoreOutlined
import antd.icon.mailOutlined
import antd.icon.settingOutlined
import antd.menu.*
import react.*
import react.dom.a
import react.dom.attrs
import react.dom.span
import styled.css
import styled.styledDiv

external interface HorizontalAppState : State {
    var current: String
}

class HorizontalApp : RComponent<Props, HorizontalAppState>() {
    private val handleClick: MenuClickEventHandler = { info ->
        console.log("click ", info)

        setState {
            current = info.key as String
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
                mailOutlined {}
                +"Navigation One"
            }
            menuItem {
                attrs {
                    key = "app"
                    disabled = true
                }
                appstoreOutlined {}
                +"Navigation Two"
            }
            subMenu {
                attrs {
                    title = buildElement {
                        span("submenu-title-wrapper") {
                            settingOutlined {}
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
    styledDiv {
        css { +MenuStyles.horizontal }
        horizontalApp()
    }
}
