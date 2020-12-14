package samples.menu

import antd.*
import antd.button.button
import antd.icon.*
import antd.menu.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

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
                if (state.collapsed) {
                  menuUnfoldOutlined {}
                } else menuFoldOutlined {}
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
                    pieChartOutlined {}
                    span { +"Option 1" }
                }
                menuItem {
                    attrs.key = "2"
                    desktopOutlined {}
                    span { +"Option 2" }
                }
                menuItem {
                    attrs.key = "3"
                    inboxOutlined {}
                    span { +"Option 3" }
                }
                subMenu {
                    attrs {
                        key = "sub1"
                        title = buildElement {
                            span {
                                mailOutlined {}
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
                                appstoreOutlined {}
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
    styledDiv {
        css { +MenuStyles.inlineCollapsed }
        inlineCollapsedApp()
    }
}
