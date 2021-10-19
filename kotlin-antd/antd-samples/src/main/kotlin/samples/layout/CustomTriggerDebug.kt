package samples.layout

import antd.MouseEventHandler
import antd.icon.*
import antd.layout.content
import antd.layout.header
import antd.layout.layout
import antd.layout.sider
import antd.menu.menu
import antd.menu.menuItem
import antd.menu.subMenu
import kotlinext.js.js
import react.*
import react.dom.div
import react.dom.span
import styled.css
import styled.styledDiv

external interface CustomTriggerDebugDemoState : State {
    var collapsed: Boolean
}

class CustomTriggerDebugDemo : RComponent<Props, CustomTriggerDebugDemoState>() {
    private val toggle: MouseEventHandler<Any> = {
        setState {
            collapsed = !state.collapsed
        }
    }

    override fun CustomTriggerDebugDemoState.init() {
        collapsed = false
    }

    override fun RBuilder.render() {
        layout {
            sider {
                attrs {
                    trigger = null
                    collapsible = true
                    collapsed = state.collapsed
                }
                div("logo") {}
                menu {
                    attrs {
                        theme = "dark"
                        mode = "inline"
                        defaultSelectedKeys = arrayOf("3")
                        defaultOpenKeys = arrayOf("sub1")
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
                    subMenu {
                        attrs {
                            key = "sub1"
                            title = buildElement {
                                span {
                                    userOutlined {}
                                    span { +"User" }
                                }
                            }
                        }
                        menuItem {
                            attrs.key = "3"
                            +"Tom"
                        }
                        menuItem {
                            attrs.key = "4"
                            +"Bill"
                        }
                        menuItem {
                            attrs.key = "5"
                            +"Alex"
                        }
                    }
                    subMenu {
                        attrs {
                            key = "sub2"
                            title = buildElement {
                                span {
                                    teamOutlined {}
                                    span { +"Team" }
                                }
                            }
                        }
                        menuItem {
                            attrs.key = "9"
                            fileOutlined {}
                            span { +"File" }
                        }
                    }
                }
            }
            layout {
                header {
                    attrs {
                        style = js {
                            background = "#fff"
                            padding = 0
                        }
                    }
                    if (state.collapsed){
                        menuUnfoldOutlined {
                            attrs {
                                className = "trigger"
                                onClick = toggle
                            }
                        }
                    } else {
                        menuFoldOutlined {
                            attrs {
                                className = "trigger"
                                onClick = toggle
                            }
                        }
                    }
                }
                content {
                    attrs {
                        style = js {
                            margin = "24px 16px"
                            padding = 24
                            background = "#fff"
                            minHeight = 280
                        }
                    }
                    +"Content"
                }
            }
        }
    }
}

fun RBuilder.customTriggerDebugDemo() = child(CustomTriggerDebugDemo::class) {}

fun RBuilder.customTriggerDebug() {
    styledDiv {
        css { +LayoutStyles.customTriggerDebug }
        customTriggerDebugDemo()
    }
}
