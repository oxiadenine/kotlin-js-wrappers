package samples.layout

import antd.icon.icon
import antd.layout.layout
import antd.layout.header
import antd.layout.content
import antd.layout.footer
import antd.layout.sider
import antd.menu.*
import kotlinext.js.js
import react.*
import react.dom.*
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
                        icon {
                            attrs.type = "user"
                        }
                        span("nav-text") { +"mav 1" }
                    }
                    menuItem {
                        attrs.key = "2"
                        icon {
                            attrs.type = "video-camera"
                        }
                        span("nav-text") { +"nav 2" }
                    }
                    menuItem {
                        attrs.key = "3"
                        icon {
                            attrs.type = "upload"
                        }
                        span("nav-text") { +"nav 3" }
                    }
                    menuItem {
                        attrs.key = "4"
                        icon {
                            attrs.type = "user"
                        }
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
                    div {
                        attrs {
                            jsStyle = js {
                                padding = 24
                                background = "#fff"
                                minHeight = 360
                            }
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
