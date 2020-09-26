package samples.breadcrumb

import antd.breadcrumb.*
import antd.icon.*
import react.*
import react.dom.*
import styled.*

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
