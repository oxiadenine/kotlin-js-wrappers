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
                homeOutlined {}
            }
            breadcrumbItem {
                attrs.href = ""
                userOutlined {}
                span { +"Application List" }
            }
            breadcrumbItem { +"Application" }
        }
    }
}
