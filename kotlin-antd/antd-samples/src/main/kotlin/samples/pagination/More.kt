package samples.pagination

import antd.pagination.pagination
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.more() {
    div("pagination-container") {
        attrs.id = "pagination-more"
        pagination {
            attrs {
                defaultCurrent = 6
                total = 500
            }
        }
    }
}
