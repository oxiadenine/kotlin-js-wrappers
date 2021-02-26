package samples.pagination

import antd.pagination.*
import react.*
import react.dom.*
import styled.*

private val handleItemRender = { _: Number, type: String, element: ReactElement ->
    if (type == "prev") {
        buildElement {
            a { +"Previous" }
        }
    } else if (type == "next") {
        buildElement {
            a { +"Next" }
        }
    }

    element
}

fun RBuilder.itemRender() {
    styledDiv {
        css { +PaginationStyles.itemRender }
        pagination {
            attrs {
                total = 500
                itemRender = handleItemRender
            }
        }
    }
}
