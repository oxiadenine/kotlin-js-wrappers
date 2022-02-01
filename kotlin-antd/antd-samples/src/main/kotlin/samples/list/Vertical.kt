package samples.list

import antd.avatar.avatar
import antd.icon.likeOutlined
import antd.icon.messageOutlined
import antd.icon.starOutlined
import antd.list.ListComponent
import antd.list.list
import antd.list.listItem
import antd.list.listItemMeta
import antd.pagination.PaginationConfig
import kotlinext.js.jso
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private external interface VerticalListDataItem {
    var href: String
    var title: String
    var avatar: String
    var description: String
    var content: String
}

private val listData = (0..23).mapIndexed { i, _ ->
    jso<VerticalListDataItem> {
        href = "http://ant.design"
        title = "ant design part $i"
        avatar = "https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"
        description = "Ant Design, a design language for background applications, is refined by Ant UED Team."
        content = "We supply a series of design principles, practical patterns and high quality design resources (Sketch and Axure), to help people create their product prototypes beautifully and efficiently."
    }
}.toTypedArray()

external interface IconTextProps : Props {
    var icon: ReactElement
    var text: String
}

private val iconText = fc<IconTextProps> { props ->
    span {
        childList += props.icon
        +" ${props.text}"
    }
}

fun RBuilder.iconText(handler: RHandler<IconTextProps>) = child(iconText, jso {}, handler)

fun RBuilder.vertical() {
    styledDiv {
        css { +ListStyles.vertical }
        list<VerticalListDataItem, ListComponent<VerticalListDataItem>> {
            attrs {
                itemLayout = "vertical"
                size = "large"
                pagination = jso<PaginationConfig> {
                    onChange = { page, _ ->
                        console.log(page)
                    }
                    pageSize = 3
                }
                dataSource = listData
                footer = buildElement {
                    div {
                        b { +"ant design" }
                        +" "
                        +"footer part"
                    }
                }
                renderItem = { item, _ ->
                    buildElement {
                        listItem {
                            attrs {
                                key = item.title
                                actions = arrayOf(
                                    buildElement {
                                        iconText {
                                            attrs {
                                                icon = buildElement {
                                                    starOutlined {}
                                                }
                                                text = "156"
                                            }
                                        }
                                    },
                                    buildElement {
                                        iconText {
                                            attrs {
                                                icon = buildElement {
                                                    likeOutlined {}
                                                }
                                                text = "156"
                                            }
                                        }
                                    },
                                    buildElement {
                                        iconText {
                                            attrs {
                                                icon = buildElement {
                                                    messageOutlined {}
                                                }
                                                text = "2"
                                            }
                                        }
                                    }

                                )
                                extra = buildElement {
                                    img {
                                        attrs {
                                            width = "272px"
                                            alt = "logo"
                                            src = "https://gw.alipayobjects.com/zos/rmsportal/mqaQswcyDLcXyDKnZfES.png"
                                        }
                                    }
                                }
                            }
                            listItemMeta {
                                attrs {
                                    avatar = buildElement {
                                        avatar {
                                            attrs.src = item.avatar
                                        }
                                    }
                                    title = buildElement {
                                        a {
                                            attrs.href = item.href
                                            +item.title
                                        }
                                    }
                                    description = item.description
                                }
                            }
                            +item.content
                        }
                    }
                }
            }
        }
    }
}
