package samples.layout

import antd.MouseEventHandler
import antd.icon.*
import antd.layout.content
import antd.layout.header
import antd.layout.layout
import antd.layout.sider
import antd.menu.menu
import antd.menu.menuItem
import kotlinext.js.js
import react.*
import react.dom.div
import react.dom.span
import styled.css
import styled.styledDiv

external interface CustomTriggerDemoState : State {
    var collapsed: Boolean
}

class CustomTriggerDemo : RComponent<Props, CustomTriggerDemoState>() {
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
