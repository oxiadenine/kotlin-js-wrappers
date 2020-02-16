package samples.pagination

import antd.pagination.pagination
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleShowSizeChange(current: Number, size: Number) {
    console.log(current, size)
}

fun RBuilder.changer() {
    div("pagination-container") {
        attrs.id = "pagination-changer"
        pagination {
            attrs {
                showSizeChanger = true
                onShowSizeChange = ::handleShowSizeChange
                defaultCurrent = 3
                total = 500
            }
        }
        br {}
        pagination {
            attrs {
                showSizeChanger = true
                onShowSizeChange = ::handleShowSizeChange
                defaultCurrent = 3
                total = 500
                disabled = true
            }
        }
    }
}
