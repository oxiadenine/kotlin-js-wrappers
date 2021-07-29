package samples.pagination

import antd.pagination.pagination
import react.RBuilder
import react.dom.br
import styled.css
import styled.styledDiv

private val handleChange = { page: Number, _: Number? ->
    console.log("Page: ", page)
}

fun RBuilder.jump() {
    styledDiv {
        css { +PaginationStyles.jump }
        pagination {
            attrs {
                showQuickJumper = true
                defaultCurrent = 2
                total = 500
                onChange = handleChange
            }
        }
        br {}
        pagination {
            attrs {
                showQuickJumper = true
                defaultCurrent = 2
                total = 500
                onChange = handleChange
                disabled = true
            }
        }
    }
}
