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

private external interface ResponsiveListDataItem {
    var title: String
}

private val data = arrayOf<ResponsiveListDataItem>(
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
    },
    jso {
        title = "Title 5"
    },
    jso {
        title = "Title 6"
    }
)

fun RBuilder.responsive() {
    styledDiv {
        css { +ListStyles.responsive }
        list<ResponsiveListDataItem, ListComponent<ResponsiveListDataItem>> {
            attrs {
                grid = jso {
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
                    buildElement {
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
}
