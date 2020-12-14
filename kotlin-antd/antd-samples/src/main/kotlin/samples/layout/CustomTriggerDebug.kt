package samples.layout

import antd.*
import antd.icon.*
import antd.layout.*
import antd.layout.header
import antd.menu.*
import kotlinext.js.*
import org.w3c.dom.*
import react.*
import react.dom.*
import styled.*

interface CustomTriggerDebugDemoState : RState {
    var collapsed: Boolean
}

class CustomTriggerDebugDemo : RComponent<RProps, CustomTriggerDebugDemoState>() {
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
