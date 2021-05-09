package samples.layout

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

fun RBuilder.responsive() {
    styledDiv {
        css { +LayoutStyles.responsive }
        layout {
            sider {
                attrs {
                    breakpoint = "lg"
                    collapsedWidth = 0
                    onBreakpoint = { broken -> console.log(broken) }
                    onCollapse = { collapsed, type -> console.log(collapsed, type) }
                }
                div("logo") {}
                menu {
                    attrs {
                        theme = "dark"
                        mode = "inline"
                        defaultSelectedKeys = arrayOf("4")
                    }
                    menuItem {
                        attrs.key = "1"
                        userOutlined {}
                        span("nav-text") { +"mav 1" }
                    }
                    menuItem {
                        attrs.key = "2"
                        videoCameraOutlined {}
                        span("nav-text") { +"nav 2" }
                    }
                    menuItem {
                        attrs.key = "3"
                        uploadOutlined {}
                        span("nav-text") { +"nav 3" }
                    }
                    menuItem {
                        attrs.key = "4"
                        userOutlined {}
                        span("nav-text") { +"nav 4" }
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
                }
                content {
                    attrs.style = js { margin = "24px 16px 0" }
                    styledDiv {
                        css {
                            padding(24.px)
                            background = "#fff"
                            minHeight = 360.px
                        }
                        +"content"
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
