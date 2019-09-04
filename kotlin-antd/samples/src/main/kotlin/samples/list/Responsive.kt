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
        },
        js {
            title = "Title 5"
        },
        js {
            title = "Title 6"
        }
)

fun RBuilder.responsive() {
    div("list-container") {
        attrs.id = "list-responsive"
        list {
            attrs {
                grid = jsObject {
                    gutter = 16
                    xs = 1
                    sm = 2
                    md = 4
                    lg = 4
                    xl = 6
                    xxl = 3
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
