package samples.layout

import antd.MouseEventHandler
import antd.icon.icon
import antd.layout.layout
import antd.layout.header
import antd.layout.content
import antd.layout.sider
import antd.menu.*
import kotlinext.js.js
import kotlinx.html.id
import org.w3c.dom.HTMLElement
import react.*
import react.dom.*

interface CustomTriggerDebugDemoState : RState {
    var collapsed: Boolean
}

class CustomTriggerDebugDemo : RComponent<RProps, CustomTriggerDebugDemoState>() {
    private val toggle: MouseEventHandler<HTMLElement> = {
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
                    subMenu {
                        attrs {
                            key = "sub1"
                            title = buildElement {
                                span {
                                    icon {
                                        attrs.type = "user"
                                    }
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
                                    icon {
                                        attrs.type = "team"
                                    }
                                    span { +"Team" }
                                }
                            }
                        }
                        menuItem {
                            attrs.key = "9"
                            icon {
                                attrs.type = "file"
                            }
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

fun RBuilder.customTriggerDebugDemo() = child(CustomTriggerDebugDemo::class) {}

fun RBuilder.customTriggerDebug() {
    div("layout-container") {
        attrs.id = "layout-custom-trigger-debug"
        customTriggerDebugDemo()
    }
}
