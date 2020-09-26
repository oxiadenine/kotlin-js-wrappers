package samples.list

import antd.card.*
import antd.list.*
import kotlinext.js.*
import react.*
import styled.*

private interface ResponsiveListDataItem {
    var title: String
}

private val data = arrayOf<ResponsiveListDataItem>(
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
    },
    jsObject {
        title = "Title 5"
    },
    jsObject {
        title = "Title 6"
    }
)

fun RBuilder.responsive() {
    styledDiv {
        css { +ListStyles.responsive }
        list<ResponsiveListDataItem, ListComponent<ResponsiveListDataItem>> {
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
