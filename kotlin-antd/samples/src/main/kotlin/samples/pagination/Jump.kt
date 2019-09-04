package samples.pagination

import antd.pagination.pagination
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleChange(page: Number, pageSize: Number?) {
    console.log("Page: ", page)
}

fun RBuilder.jump() {
    div("pagination-container") {
        attrs.id = "pagination-jump"
        pagination {
            attrs {
                showQuickJumper = true
                defaultCurrent = 2
                total = 500
                onChange = ::handleChange
            }
        }
        br {}
        pagination {
            attrs {
                showQuickJumper = true
                defaultCurrent = 2
                total = 500
                onChange = ::handleChange
                disabled = true
            }
        }
    }
}
