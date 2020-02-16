package samples.menu

import antd.MouseEventHandler
import antd.button.button
import antd.icon.icon
import antd.menu.*
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

interface InlineCollapsedAppState : RState {
    var collapsed: Boolean
}

class InlineCollapsedApp : RComponent<RProps, InlineCollapsedAppState>() {
    private val toggleCollapsed: MouseEventHandler<Any> = {
        setState {
            collapsed = !state.collapsed
        }
    }

    override fun InlineCollapsedAppState.init() {
        collapsed = false
    }

    override fun RBuilder.render() {
        div {
            attrs.jsStyle = js { width = 256 }
            button {
                attrs {
                    type = "primary"
                    onClick = toggleCollapsed
                    style = js { marginBottom = 16 }
                }
                icon {
                    attrs.type = if (state.collapsed) "menu-unfold" else "menu-fold"
                }
            }
            menu {
                attrs {
                    defaultSelectedKeys = arrayOf("1")
                    defaultOpenKeys = arrayOf("sub1")
                    mode = "inline"
                    theme = "dark"
                    inlineCollapsed = state.collapsed
                }
                menuItem {
                    attrs.key = "1"
                    icon {
                        attrs.type = "pie-chart"
                    }
                    span { +"Option 1" }
                }
                menuItem {
                    attrs.key = "2"
                    icon {
                        attrs.type = "desktop"
                    }
                    span { +"Option 2" }
                }
                menuItem {
                    attrs.key = "3"
                    icon {
                        attrs.type = "inbox"
                    }
                    span { +"Option 3" }
                }
                subMenu {
                    attrs {
                        key = "sub1"
                        title = buildElement {
                            span {
                                icon {
                                    attrs.type = "mail"
                                }
                                span { +"Navigation One" }
                            }
                        }
                    }
                    menuItem {
                        attrs.key = "5"
                        +"Option 5"
                    }
                    menuItem {
                        attrs.key = "6"
                        +"Option 6"
                    }
                    menuItem {
                        attrs.key = "7"
                        +"Option 7"
                    }
                    menuItem {
                        attrs.key = "8"
                        +"Option 8"
                    }
                }
                subMenu {
                    attrs {
                        key = "sub2"
                        title = buildElement {
                            span {
                                icon {
                                    attrs.type = "appstore"
                                }
                                span { +"Navigation Two" }
                            }
                        }
                    }
                    menuItem {
                        attrs.key = "9"
                        +"Option 9"
                    }
                    menuItem {
                        attrs.key = "10"
                        +"Option 10"
                    }
                    subMenu {
                        attrs {
                            key = "sub3"
                            title = "SubMenu"
                        }
                        menuItem {
                            attrs.key = "11"
                            +"Option 11"
                        }
                        menuItem {
                            attrs.key = "12"
                            +"Option 12"
                        }
                    }
                }
            }
        }
    }
}

fun RBuilder.inlineCollapsedApp() = child(InlineCollapsedApp::class) {}

fun RBuilder.inlineCollapsed() {
    div("menu-container") {
        attrs.id = "menu-inline-collapsed"
        inlineCollapsedApp()
    }
}
