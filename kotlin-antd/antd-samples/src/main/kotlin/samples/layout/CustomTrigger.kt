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

interface CustomTriggerDemoState : RState {
    var collapsed: Boolean
}

class CustomTriggerDemo : RComponent<RProps, CustomTriggerDemoState>() {
    private val toggle: MouseEventHandler<HTMLElement> = {
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
                        icon {
                            attrs.type = "user"
                        }
                        span { +"mav 1" }
                    }
                    menuItem {
                        attrs.key = "2"
                        icon {
                            attrs.type = "video-camera"
                        }
                        span { +"nav 2" }
                    }
                    menuItem {
                        attrs.key = "3"
                        icon {
                            attrs.type = "upload"
                        }
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
                    icon {
                        attrs {
                            className = "trigger"
                            type = if (state.collapsed) "menu-unfold" else "menu-fold"
                            onClick = toggle
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
