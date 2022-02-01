package samples.list

import antd.avatar.avatar
import antd.list.ListComponent
import antd.list.list
import antd.list.listItem
import antd.list.listItemMeta
import kotlinext.js.jso
import react.RBuilder
import react.buildElement
import react.dom.a
import styled.css
import styled.styledDiv

private external interface BasicListDataItem {
    var title: String
}

private val data = arrayOf<BasicListDataItem>(
    jso {
        title = "Ant Design Title 1"
    },
    jso {
        title = "Ant Design Title 2"
    },
    jso {
        title = "Ant Design Title 3"
    },
    jso {
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
                    buildElement {
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
}
