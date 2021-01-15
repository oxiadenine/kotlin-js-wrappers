package samples.breadcrumb

import antd.breadcrumb.*
import react.*
import styled.*

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
