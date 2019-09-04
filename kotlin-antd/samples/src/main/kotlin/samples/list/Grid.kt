package samples.list

import antd.card.card
import antd.list.list
import antd.list.listItem
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.id
import react.RBuilder
import react.dom.div

private val data = arrayOf(
        js {
            title = "Title 1"
        },
        js {
            title = "Title 2"
        },
        js {
            title = "Title 3"
        },
        js {
            title = "Title 4"
        }
)

fun RBuilder.grid() {
    div("list-container") {
        attrs.id = "list-grid"
        list {
            attrs {
                grid = jsObject {
                    gutter = 16
                    column = 4
                }
                dataSource = data
                renderItem = { item, _ ->
                    listItem {
                        card {
                            attrs.title = item.asDynamic().title.unsafeCast<String>()
                            +"Card content"
                        }
                    }
                }
            }
        }
    }
}
