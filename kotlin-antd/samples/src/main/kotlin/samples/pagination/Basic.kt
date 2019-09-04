package samples.pagination

import antd.pagination.pagination
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.basic() {
    div("pagination-container") {
        attrs.id = "pagination-basic"
        pagination {
            attrs {
                defaultCurrent = 1
                total = 50
            }
        }
    }
}
