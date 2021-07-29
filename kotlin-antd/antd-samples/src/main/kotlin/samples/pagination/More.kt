package samples.pagination

import antd.pagination.pagination
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.more() {
    styledDiv {
        css { +PaginationStyles.more }
        pagination {
            attrs {
                defaultCurrent = 6
                total = 500
            }
        }
    }
}
