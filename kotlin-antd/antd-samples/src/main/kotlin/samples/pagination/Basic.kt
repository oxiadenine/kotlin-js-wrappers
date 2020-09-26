package samples.pagination

import antd.pagination.*
import react.*
import styled.*

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
