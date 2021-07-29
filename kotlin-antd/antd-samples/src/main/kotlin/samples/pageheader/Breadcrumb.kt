package samples.pageheader

import antd.breadcrumb.Route
import antd.pageheader.pageHeader
import kotlinext.js.jsObject
import react.RBuilder
import styled.css
import styled.styledDiv

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
