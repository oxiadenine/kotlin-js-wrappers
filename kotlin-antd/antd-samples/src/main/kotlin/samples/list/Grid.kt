package samples.list

import antd.card.card
import antd.list.ListComponent
import antd.list.list
import antd.list.listItem
import kotlinext.js.jsObject
import kotlinx.html.id
import react.RBuilder
import react.dom.div

private interface GridListDataItem {
    var title: String
}

private val data = arrayOf<GridListDataItem>(
        jsObject {
            title = "Title 1"
        },
        jsObject {
            title = "Title 2"
        },
        jsObject {
            title = "Title 3"
        },
        jsObject {
            title = "Title 4"
        }
)

fun RBuilder.grid() {
    div("list-container") {
        attrs.id = "list-grid"
        list<GridListDataItem, ListComponent<GridListDataItem>> {
            attrs {
                grid = jsObject {
                    gutter = 16
                    column = 4
                }
                dataSource = data
                renderItem = { item, _ ->
                    listItem {
                        card {
                            attrs.title = item.title
                            +"Card content"
                        }
                    }
                }
            }
        }
    }
}
