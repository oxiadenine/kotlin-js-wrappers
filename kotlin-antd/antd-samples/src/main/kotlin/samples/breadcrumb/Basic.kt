package samples.breadcrumb

import antd.breadcrumb.breadcrumb
import antd.breadcrumb.breadcrumbItem
import react.RBuilder
import react.dom.a
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +BreadcrumbStyles.basic }
        breadcrumb {
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
