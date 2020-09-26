package samples.breadcrumb

import antd.breadcrumb.breadcrumb
import antd.breadcrumb.breadcrumbItem
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

fun RBuilder.separator() {
    styledDiv {
        css { +BreadcrumbStyles.separator }
        breadcrumb {
            attrs.separator = ">"
            breadcrumbItem { +"Home" }
            breadcrumbItem {
                a {
                    attrs.href = ""
                    +"Application Center"
                }
            }
            breadcrumbItem {
                a {
                    attrs.href = ""
                    +"Application List"
                }
            }
            breadcrumbItem { +"An Application" }
        }
    }
}
