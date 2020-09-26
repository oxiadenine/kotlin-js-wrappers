package samples.breadcrumb

import antd.breadcrumb.breadcrumb
import antd.breadcrumb.breadcrumbItem
import antd.icon.icon
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

fun RBuilder.withIcon() {
    styledDiv {
        css { +BreadcrumbStyles.withIcon }
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
