package samples.breadcrumb

import antd.breadcrumb.breadcrumb
import antd.breadcrumb.breadcrumbItem
import antd.icon.icon
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.withIcon() {
    div("breadcrumb-container") {
        attrs.id = "breadcrumb-with-icon"
        breadcrumb {
            breadcrumbItem {
                attrs.href = ""
                icon {
                    attrs.type = "home"
                }
            }
            breadcrumbItem {
                attrs.href = ""
                icon {
                    attrs.type = "user"
                }
                span { +"Application List" }
            }
            breadcrumbItem { +"Application" }
        }
    }
}
