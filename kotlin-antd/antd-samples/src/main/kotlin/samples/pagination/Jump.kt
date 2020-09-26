package samples.pagination

import antd.pagination.*
import react.*
import react.dom.*
import styled.*

private fun handleChange(page: Number, pageSize: Number?) {
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
