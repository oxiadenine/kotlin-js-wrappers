package samples.layout

import antd.breadcrumb.*
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

fun RBuilder.top() {
    styledDiv {
        css { +LayoutStyles.top }
        layout {
            attrs.className = "layout"
            header {
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
                attrs.style = js { padding = "0 50px" }
                breadcrumb {
                    attrs.style = js { margin = "16px 0" }
                    breadcrumbItem { +"Home" }
                    breadcrumbItem { +"List" }
                    breadcrumbItem { +"App" }
                }
                styledDiv {
                    css {
                        background = "#fff"
                        padding = "24px"
                        minHeight = 280.px
                    }
                    +"Content"
                }
            }
            footer {
                attrs.style = js { textAlign = "center" }
                +"Ant Design ©2016 Created by Ant UED"
            }
        }
    }
}
