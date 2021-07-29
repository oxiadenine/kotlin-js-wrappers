package samples.layout

import antd.icon.uploadOutlined
import antd.icon.userOutlined
import antd.icon.videoCameraOutlined
import antd.layout.*
import antd.menu.menu
import antd.menu.menuItem
import kotlinext.js.js
import kotlinx.css.background
import kotlinx.css.minHeight
import kotlinx.css.padding
import kotlinx.css.px
import react.RBuilder
import react.dom.div
import react.dom.span
import react.key
import styled.css
import styled.styledDiv

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
