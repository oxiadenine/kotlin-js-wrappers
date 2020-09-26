package samples.pageheader

import antd.breadcrumb.*
import antd.pageheader.*
import kotlinext.js.*
import react.*
import styled.*

private val breadcrumbRoutes = arrayOf<Route>(
    jsObject {
        path = "index"
        breadcrumbName = "First-level Menu"
    },
    jsObject {
        path = "first"
        breadcrumbName = "Second-level Menu"
    },
    jsObject {
        path = "second"
        breadcrumbName = "Third-level Menu"
    }
)

fun RBuilder.breadcrumb() {
    styledDiv {
        css { +PageHeaderStyles.breadcrumb }
        pageHeader {
            attrs {
                title = "Title"
                breadcrumb = jsObject { routes = breadcrumbRoutes }
            }
        }
    }
}
