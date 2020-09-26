package samples.breadcrumb

import antd.breadcrumb.*
import react.*
import react.dom.*
import styled.*

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
