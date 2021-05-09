package samples.layout

import antd.breadcrumb.*
import antd.icon.*
import antd.layout.*
import antd.layout.footer
import antd.layout.header
import antd.menu.*
import kotlinext.js.*
import kotlinx.css.background
import kotlinx.css.minHeight
import kotlinx.css.padding
import kotlinx.css.px
import react.*
import react.dom.*
import styled.*

external interface SiderDemoState : RState {
    var collapsed: Boolean
}

class SiderDemo : RComponent<RProps, SiderDemoState>() {
    private val handleCollapse = fun(collapsedFlag: Boolean, _: CollapseType) {
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
                        fileOutlined {}
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
                    styledDiv {
                        css {
                            padding(24.px)
                            background = "#fff"
                            minHeight = 360.px
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
