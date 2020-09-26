package samples.pagination

import antd.pagination.*
import react.*
import styled.*

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
