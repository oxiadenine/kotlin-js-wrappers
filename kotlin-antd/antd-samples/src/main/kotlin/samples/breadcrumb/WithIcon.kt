package samples.breadcrumb

import antd.breadcrumb.breadcrumb
import antd.breadcrumb.breadcrumbItem
import antd.icon.homeOutlined
import antd.icon.userOutlined
import react.RBuilder
import react.dom.span
import styled.css
import styled.styledDiv

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
