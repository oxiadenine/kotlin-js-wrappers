package samples.list

import antd.avatar.*
import antd.list.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

private external interface BasicListDataItem {
    var title: String
}

private val data = arrayOf<BasicListDataItem>(
    jsObject {
        title = "Ant Design Title 1"
    },
    jsObject {
        title = "Ant Design Title 2"
    },
    jsObject {
        title = "Ant Design Title 3"
    },
    jsObject {
        title = "Ant Design Title 4"
    }
)

fun RBuilder.basic() {
    styledDiv {
        css { +ListStyles.basic }
        list<BasicListDataItem, ListComponent<BasicListDataItem>> {
            attrs {
                itemLayout = "horizontal"
                dataSource = data
                renderItem = { item, _ ->
                    listItem {
                        listItemMeta {
                            attrs {
                                avatar = buildElement {
                                    avatar {
                                        attrs.src = "https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"
                                    }
                                }
                                title = buildElement {
                                    a {
                                        attrs.href = "https://ant.design"
                                        +item.title
                                    }
                                }
                                description = "Ant Design, a design language for background applications, is refined by Ant UED Team"
                            }
                        }
                    }
                }
            }
        }
    }
}
