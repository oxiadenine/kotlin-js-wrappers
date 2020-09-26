package samples.breadcrumb

import antd.breadcrumb.*
import antd.menu.*
import react.*
import react.dom.*
import styled.*

private val menu = buildElement {
    menu {
        menuItem {
            a {
                attrs {
                    target = "_blank"
                    rel = "noopener noreferrer"
                    href = "http://www.alipay.com/"
                }
                +"General"
            }
        }
        menuItem {
            a {
                attrs {
                    target = "_blank"
                    rel = "noopener noreferrer"
                    href = "http://www.taobao.com/"
                }
                +"Layout"
            }
        }
        menuItem {
            a {
                attrs {
                    target = "_blank"
                    rel = "noopener noreferrer"
                    href = "http://www.tmall.com/"
                }
                +"Navigation"
            }
        }
    }
}

fun RBuilder.overlay() {
    styledDiv {
        css { +BreadcrumbStyles.overlay }
        breadcrumb {
            breadcrumbItem { +"Ant Design" }
            breadcrumbItem {
                a {
                    attrs.href = ""
                    +"Component"
                }
            }
            breadcrumbItem {
                attrs.overlay = menu
                a {
                    attrs.href = ""
                    +"General"
                }
            }
            breadcrumbItem { +"Button" }
        }
    }
}
