package samples.list

import antd.card.card
import antd.list.ListComponent
import antd.list.list
import antd.list.listItem
import kotlinext.js.jso
import react.RBuilder
import react.buildElement
import styled.css
import styled.styledDiv

private external interface GridListDataItem {
    var title: String
}

private val data = arrayOf<GridListDataItem>(
    jso {
        title = "Title 1"
    },
    jso {
        title = "Title 2"
    },
    jso {
        title = "Title 3"
    },
    jso {
        title = "Title 4"
    }
)

fun RBuilder.grid() {
    styledDiv {
        css { +ListStyles.grid }
        list<GridListDataItem, ListComponent<GridListDataItem>> {
            attrs {
                grid = jso {
                    gutter = 16
                    column = 4
                }
                dataSource = data
                renderItem = { item, _ ->
                    buildElement {
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
}
