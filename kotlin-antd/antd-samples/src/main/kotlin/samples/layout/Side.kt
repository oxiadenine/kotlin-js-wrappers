package samples.layout

import antd.breadcrumb.*
import antd.icon.*
import antd.layout.*
import antd.layout.footer
import antd.layout.header
import antd.menu.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

interface SiderDemoState : RState {
    var collapsed: Boolean
}

class SiderDemo : RComponent<RProps, SiderDemoState>() {
    private val handleCollapse = fun(collapsedFlag: Boolean, _: SiderCollapseType) {
        console.log(collapsedFlag)

        setState {
            collapsed = collapsedFlag
        }
    }

    override fun SiderDemoState.init() {
        collapsed = false
    }

    override fun RBuilder.render() {
        layout {
            attrs.style = js { minHeight = "100vh" }
            sider {
                attrs {
                    collapsible = false
                    collapsed = state.collapsed
                    onCollapse = handleCollapse
                }
                div("logo") {}
                menu {
                    attrs {
                        theme = "dark"
                        defaultSelectedKeys = arrayOf("1")
                        mode = "inline"
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
                            attrs.key = "6"
                            +"Team 1"
                        }
                        menuItem {
                            attrs.key = "8"
                            +"Team 2"
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
            layout {
                header {
                    attrs.style = js {
                        background = "#fff"
                        padding = 0
                    }
                }
                content {
                    attrs.style = js { margin = "0 16px" }
                    breadcrumb {
                        attrs.style = js { margin = "16px 0" }
                        breadcrumbItem { +"User" }
                        breadcrumbItem { +"Bill" }
                    }
                    div {
                        attrs.jsStyle = js {
                            padding = 24
                            background = "#fff"
                            minHeight = 360
                        }
                        +"Bill is a cat."
                    }
                }
                footer {
                    attrs.style = js { textAlign = "center" }
                    +"Ant Design ©2016 Created by Ant UED"
                }
            }
        }
    }
}

fun RBuilder.siderDemo() = child(SiderDemo::class) {}

fun RBuilder.side() {
    styledDiv {
        css { +LayoutStyles.side }
        siderDemo()
    }
}
