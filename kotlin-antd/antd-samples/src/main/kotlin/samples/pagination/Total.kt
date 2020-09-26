package samples.pagination

import antd.pagination.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.total() {
    styledDiv {
        css { +PaginationStyles.total }
        div {
            pagination {
                attrs {
                    total = 85
                    showTotal = fun(total: Number, _: Array<Number>): ReactElement {
                        return buildElement { +"Total $total items" }
                    }
                    pageSize = 20
                    defaultCurrent = 1
                }
            }
            br {}
            pagination {
                attrs {
                    total = 85
                    showTotal = fun(total: Number, range: Array<Number>): ReactElement {
                        return buildElement { +"${range[0]}-${range[1]} of $total items" }
                    }
                    pageSize = 20
                    defaultCurrent = 1
                }
            }
        }
    }
}
