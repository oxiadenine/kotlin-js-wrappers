package samples.pagination

import antd.pagination.PageRenderType
import antd.pagination.pagination
import kotlinx.html.id
import react.*
import react.dom.*

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
    div("pagination-container") {
        attrs.id = "pagination-item-render"
        pagination {
            attrs {
                total = 500
                itemRender = ::handleItemRender
            }
        }
    }
}
