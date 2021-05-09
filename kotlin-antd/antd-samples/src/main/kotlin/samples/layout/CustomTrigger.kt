package samples.layout

import antd.*
import antd.icon.*
import antd.layout.*
import antd.layout.header
import antd.menu.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

external interface CustomTriggerDemoState : RState {
    var collapsed: Boolean
}

class CustomTriggerDemo : RComponent<RProps, CustomTriggerDemoState>() {
    private val toggle: MouseEventHandler<Any> = {
        setState {
            collapsed = !state.collapsed
        }
    }

    override fun CustomTriggerDemoState.init() {
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
                        defaultSelectedKeys = arrayOf("1")
                    }
                    menuItem {
                        attrs.key = "1"
                        userOutlined {}
                        span { +"mav 1" }
                    }
                    menuItem {
                        attrs.key = "2"
                        videoCameraOutlined {}
                        span { +"nav 2" }
                    }
                    menuItem {
                        attrs.key = "3"
                        uploadOutlined {}
                        span { +"nav 3" }
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

fun RBuilder.customTriggerDemo() = child(CustomTriggerDemo::class) {}

fun RBuilder.customTrigger() {
    styledDiv {
        css { +LayoutStyles.customTrigger }
        customTriggerDemo()
    }
}
