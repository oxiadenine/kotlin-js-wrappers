package samples.pageheader

import antd.breadcrumb.Route
import antd.pageheader.pageHeader
import kotlinext.js.jsObject
import kotlinx.html.id
import react.RBuilder
import react.dom.div

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
    div("page-header-container") {
        attrs.id = "page-header-breadcrumb"
        pageHeader {
            attrs {
                title = "Title"
                breadcrumb = jsObject { routes = breadcrumbRoutes }
            }
        }
    }
}
