package samples.breadcrumb

import antd.breadcrumb.breadcrumb
import antd.breadcrumb.breadcrumbItem
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.separator() {
    div("breadcrumb-container") {
        attrs.id = "breadcrumb-separator"
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
