package samples.breadcrumb

import antd.breadcrumb.breadcrumb
import antd.breadcrumb.breadcrumbItem
import antd.breadcrumb.breadcrumbSeparator
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.separatorIndepent() {
    styledDiv {
        css { +BreadcrumbStyles.separatorIndepent }
        breadcrumb {
            attrs.separator = ""
            breadcrumbItem { +"Location" }
            breadcrumbSeparator { +":" }
            breadcrumbItem {
                attrs.href = ""
                +"Application Center"
            }
            breadcrumbSeparator {}
            breadcrumbItem {
                attrs.href = ""
                +"Application List"
            }
            breadcrumbSeparator {}
            breadcrumbItem { +"An Application" }
        }
    }
}
