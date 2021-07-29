package samples.pagination

import antd.pagination.pagination
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.simple() {
    styledDiv {
        css { +PaginationStyles.simple }
        pagination {
            attrs {
                simple = true
                defaultCurrent = 2
                total = 50
            }
        }
    }
}
