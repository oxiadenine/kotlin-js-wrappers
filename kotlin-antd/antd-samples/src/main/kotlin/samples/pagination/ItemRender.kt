package samples.pagination

import antd.pagination.pagination
import react.RBuilder
import react.ReactElement
import react.buildElement
import react.dom.a
import styled.css
import styled.styledDiv

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
