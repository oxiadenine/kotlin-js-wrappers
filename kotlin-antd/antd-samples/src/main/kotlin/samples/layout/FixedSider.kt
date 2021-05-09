package samples.layout

import antd.icon.*
import antd.layout.*
import antd.layout.footer
import antd.layout.header
import antd.menu.*
import kotlinext.js.*
import kotlinx.css.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.fixedSider() {
    styledDiv {
        css { +LayoutStyles.fixedSider }
        layout {
            sider {
                attrs {
                    style = js {
                        overflow = "auto"
                        height = "100vh"
                        position = "fixed"
                        left = 0
                    }
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
                        barChartOutlined {}
                        span("nav-text") { +"nav 4" }
                    }
                    menuItem {
                        attrs.key = "5"
                        cloudOutlined {}
                        span("nav-text") { +"nav 5" }
                    }
                    menuItem {
                        attrs.key = "6"
                        appstoreOutlined {}
                        span("nav-text") { +"nav 6" }
                    }
                    menuItem {
                        attrs.key = "7"
                        teamOutlined {}
                        span("nav-text") { +"nav 7" }
                    }
                    menuItem {
                        attrs.key = "8"
                        shopOutlined {}
                        span("nav-text") { +"nav 8" }
                    }
                }
            }
            layout {
                attrs.style = js { marginLeft = 200 }
                header {
                    attrs {
                        style = js {
                            background = "#fff"
                            padding = 0
                        }
                    }
                }
                content {
                    attrs {
                        style = js {
                            margin = "24px 16px 0"
                            overflow = "initial"
                        }
                    }
                    styledDiv {
                        css {
                            padding(24.px)
                            background = "#fff"
                            textAlign = TextAlign.center
                        }
                        +"..."
                        br {}
                        +"Really"
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"long"
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
                        +"..."
                        br {}
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
