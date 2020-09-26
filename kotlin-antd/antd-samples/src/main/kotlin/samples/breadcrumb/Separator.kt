package samples.breadcrumb

import antd.breadcrumb.*
import react.*
import react.dom.*
import styled.*

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
