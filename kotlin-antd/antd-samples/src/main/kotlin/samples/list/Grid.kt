package samples.list

import antd.card.*
import antd.list.*
import kotlinext.js.*
import react.*
import styled.*

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
    styledDiv {
        css { +ListStyles.grid }
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
