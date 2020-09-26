package samples.skeleton

import antd.avatar.avatar
import antd.icon.icon
import antd.list.ListComponent
import antd.list.list
import antd.list.listItem
import antd.list.listItemMeta
import antd.skeleton.skeleton
import antd.switch.switch
import kotlinext.js.js
import kotlinext.js.jsObject
import org.w3c.dom.events.MouseEvent
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private interface ListListDataItem {
    var href: String
    var title: String
    var avatar: String
    var description: String
    var content: String
}

private val listData = (0..2).map { i ->
    jsObject<ListListDataItem> {
        href = "http://ant.design"
        title = "ant design part $i"
        avatar = "https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"
        description = "Ant Design, a design language for background applications, is refined by Ant UED Team."
        content = "We supply a series of design principles, practical patterns and high quality design resources (Sketch and Axure), to help people create their product prototypes beautifully and efficiently."
    }
}.toTypedArray()

interface ListIconTextProps : RProps {
    var type: String
    var text: String
}

class ListIconText : RComponent<ListIconTextProps, RState>() {
    override fun RBuilder.render() {
        span {
            icon {
                attrs {
                    type = props.type
                    style = js { marginRight = 8 }
                }
            }
            +props.text
        }
    }
}

fun RBuilder.iconText(handler: RHandler<ListIconTextProps>) = child(ListIconText::class, handler)

interface ListAppState : RState {
    var loading: Boolean
}

class ListApp : RComponent<RProps, ListAppState>() {
    private val handleChange = fun (checked: Boolean, _: MouseEvent) {
        setState {
            loading = !checked
        }
    }

    override fun ListAppState.init() {
        loading = true
    }

    override fun RBuilder.render() {
        div {
            switch {
                attrs {
                    checked = !state.loading
                    onChange = handleChange
                }
            }
            list<ListListDataItem, ListComponent<ListListDataItem>> {
                attrs {
                    itemLayout = "vertical"
                    size = "large"
                    dataSource = listData
                    renderItem = { item, _ ->
                        listItem {
                            attrs {
                                key = item.title
                                actions = if (!state.loading) {
                                    arrayOf(
                                            buildElement {
                                                iconText {
                                                    attrs {
                                                        type = "star-o"
                                                        text = "156"
                                                    }
                                                }
                                            },
                                            buildElement {
                                                iconText {
                                                    attrs {
                                                        type = "like-o"
                                                        text = "156"
                                                    }
                                                }
                                            },
                                            buildElement {
                                                iconText {
                                                    attrs {
                                                        type = "message"
                                                        text = "2"
                                                    }
                                                }
                                            }
                                    )
                                } else null
                                extra = if (!state.loading) {
                                    buildElement {
                                        img {
                                            attrs {
                                                width = "272px"
                                                alt = "logo"
                                                src = "https://gw.alipayobjects.com/zos/rmsportal/mqaQswcyDLcXyDKnZfES.png"
                                            }
                                        }
                                    }
                                } else null
                            }
                            skeleton {
                                attrs {
                                    loading = state.loading
                                    active = true
                                    avatar = true
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
}

fun RBuilder.listApp() = child(ListApp::class) {}

fun RBuilder.list() {
    styledDiv {
        css { +SkeletonStyles.list }
        listApp()
    }
}
