package samples.pagination

import antd.pagination.*
import react.*
import styled.*

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
