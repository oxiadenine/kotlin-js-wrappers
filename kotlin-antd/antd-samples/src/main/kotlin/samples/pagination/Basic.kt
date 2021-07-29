package samples.pagination

import antd.pagination.pagination
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +PaginationStyles.basic }
        pagination {
            attrs {
                defaultCurrent = 1
                total = 50
            }
        }
    }
}
