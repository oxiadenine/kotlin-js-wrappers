package samples.pagination

import antd.pagination.pagination
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.simple() {
    div("pagination-container") {
        attrs.id = "pagination-simple"
        pagination {
            attrs {
                simple = true
                defaultCurrent = 2
                total = 50
            }
        }
    }
}
