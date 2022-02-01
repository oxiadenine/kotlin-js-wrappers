package samples.pageheader

import antd.breadcrumb.Route
import antd.pageheader.pageHeader
import kotlinext.js.jso
import react.RBuilder
import styled.css
import styled.styledDiv

private val breadcrumbRoutes = arrayOf<Route>(
    jso {
        path = "index"
        breadcrumbName = "First-level Menu"
    },
    jso {
        path = "first"
        breadcrumbName = "Second-level Menu"
    },
    jso {
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
                breadcrumb = jso { routes = breadcrumbRoutes }
            }
        }
    }
}
