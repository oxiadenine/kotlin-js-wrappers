package samples.pageheader

import antd.pageheader.pageHeader
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.basic() {
    div("page-header-container") {
        attrs.id = "page-header-basic"
        pageHeader {
            attrs {
                onBack = {}
                title = "Title"
                subTitle = "This is a subtitle"
            }
        }
    }
}
