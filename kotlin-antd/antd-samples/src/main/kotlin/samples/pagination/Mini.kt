package samples.pagination

import antd.pagination.pagination
import kotlinx.html.id
import react.*
import react.dom.*

private fun showTotal(total: Number, range: Array<Number>): ReactElement {
    return buildElement { +"Total $total items" }
}

fun RBuilder.mini() {
    div("pagination-container") {
        attrs.id = "pagination-mini"
        div {
            pagination {
                attrs {
                    size = "small"
                    total = 50
                }
            }
            pagination {
                attrs {
                    size = "small"
                    total = 50
                    showSizeChanger = true
                    showQuickJumper = true
                }
            }
            pagination {
                attrs {
                    size = "small"
                    total = 50
                    showTotal = ::showTotal
                }
            }
        }
    }
}
