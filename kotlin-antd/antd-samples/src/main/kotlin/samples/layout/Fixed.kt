package samples.layout

import antd.breadcrumb.breadcrumb
import antd.breadcrumb.breadcrumbItem
import antd.layout.layout
import antd.layout.header
import antd.layout.content
import antd.layout.footer
import antd.menu.*
import kotlinext.js.js
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

fun RBuilder.fixed() {
    styledDiv {
        css { +LayoutStyles.fixed }
        layout {
            header {
                attrs {
                    style = js {
                        position = "fixed"
                        zIndex = 1
                        width = "100%"
                    }
                }
                div("logo") {}
                menu {
                    attrs {
                        theme = "dark"
                        mode = "horizontal"
                        defaultSelectedKeys = arrayOf("2")
                        style = js { lineHeight = "64px" }
                    }
                    menuItem {
                        attrs.key = "1"
                        +"nav 1"
                    }
                    menuItem {
                        attrs.key = "2"
                        +"nav 2"
                    }
                    menuItem {
                        attrs.key = "3"
                        +"nav 3"
                    }
                }
            }
            content {
                attrs {
                    style = js {
                        padding = "0 50px"
                        marginTop = 64
                    }
                }
                breadcrumb {
                    attrs.style = js { margin = "16px 0" }
                    breadcrumbItem { +"Home" }
                    breadcrumbItem { +"List" }
                    breadcrumbItem { +"App" }
                }
                div {
                    attrs {
                        jsStyle = js {
                            background = "#fff"
                            padding = 24
                            minHeight = 380
                        }
                    }
                    + "Content"
                }
            }
            footer {
                attrs.style = js { textAlign = "center" }
                +"Ant Design ©2016 Created by Ant UED"
            }
        }
    }
}
