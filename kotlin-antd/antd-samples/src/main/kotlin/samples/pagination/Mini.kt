package samples.pagination

import antd.pagination.pagination
import react.RBuilder
import react.buildElement
import react.dom.div
import styled.css
import styled.styledDiv

private val showTotalPag = { total: Number, _: Array<Number> ->
    buildElement { +"Total $total items" }
}

fun RBuilder.mini() {
    styledDiv {
        css { +PaginationStyles.mini }
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
                    showTotal = showTotalPag
                }
            }
        }
    }
}
