package samples.pagination

import antd.pagination.PageRenderType
import antd.pagination.pagination
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private fun handleItemRender(page: Number, type: PageRenderType, element: ReactElement): ReactElement {
    if (type == "prev") {
        return buildElement {
            a { +"Previous" }
        }
    } else if (type == "next") {
        return buildElement {
            a { +"Next" }
        }
    }

    return element
}

fun RBuilder.itemRender() {
    styledDiv {
        css { +PaginationStyles.itemRender }
        pagination {
            attrs {
                total = 500
                itemRender = ::handleItemRender
            }
        }
    }
}
