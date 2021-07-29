package samples.drawer

import antd.MouseEvent
import antd.MouseEventHandler
import antd.avatar.avatar
import antd.button.button
import antd.divider.divider
import antd.drawer.EventType
import antd.drawer.drawer
import antd.grid.col
import antd.grid.row
import antd.list.ListComponent
import antd.list.list
import antd.list.listItem
import antd.list.listItemMeta
import kotlinext.js.jsObject
import kotlinx.css.*
import kotlinx.css.properties.LineHeight
import kotlinx.html.js.onClickFunction
import react.*
import react.dom.a
import react.dom.div
import styled.StyleSheet
import styled.css
import styled.styledDiv
import styled.styledP

private object UserProfileStyles : StyleSheet("user-profile", isStatic = true) {
    val pStyle by css {
        fontSize = 16.px
        color = rgba(0,0,0,0.85)
        lineHeight = LineHeight("24px")
        display = Display.block
        marginBottom = 16.px
    }
}

private external interface UserProfileListDataItem {
    var id: String
    var name: String
}

external interface DescriptionItemProps : RProps {
    var title: String
    var content: Any
}

class DescriptionItem : RComponent<DescriptionItemProps, State>() {
    override fun RBuilder.render() {
        styledDiv {
            css {
                fontSize = 14.px
                lineHeight = LineHeight("22px")
                marginBottom = 7.px
                color = rgba(0, 0, 0, 0.65)
            }
            styledP {
                css {
                    marginRight = 8.px
                    display = Display.inlineBlock
                    color = rgba(0,0,0,0.85)
                }
                +props.title
            }
            childList.add(props.content)
        }
    }
}

fun RBuilder.descriptionItem(handler: RHandler<DescriptionItemProps>) = child(DescriptionItem::class, handler)

external interface UserProfileAppState : State {
    var visible: Boolean
}

class UserProfileApp : RComponent<RProps, UserProfileAppState>() {
    private val showDrawer: MouseEventHandler<Any> = {
        setState {
            visible = true
        }
    }

    private val handleClose: (e: EventType) -> Unit = {
        setState {
            visible = false
        }
    }

    override fun UserProfileAppState.init() {
        visible = false
    }

    override fun RBuilder.render() {
        div {
            button {
                attrs.onClick = showDrawer
            }
            list<UserProfileListDataItem, ListComponent<UserProfileListDataItem>> {
                attrs {
                    dataSource = arrayOf(
                        jsObject {
                            name = "Lily"
                        },
                        jsObject {
                            name = "Lily"
                        }
                    )
                    bordered = true
                    renderItem = { item, _ ->
                        buildElement {
                            listItem {
                                attrs {
                                    key = item.id
                                    actions = arrayOf(buildElement {
                                        a {
                                            attrs.onClickFunction = { event ->
                                                showDrawer(event.unsafeCast<MouseEvent<Any>>())
                                            }
                                            +"View Profile"
                                        }
                                    })
                                }
                                listItemMeta {
                                    attrs {
                                        avatar = buildElement {
                                            avatar {
                                                attrs.src = "https://gw.alipayobjects.com/zos/rmsportal/BiazfanxmamNRoxxVxka.png"
                                            }
                                        }
                                        title = buildElement {
                                            a {
                                                attrs.href = "https://ant.design/index-cn"
                                                +item.name
                                            }
                                        }
                                        description = "Progresser AFX"
                                    }
                                }
                            }
                        }
                    }
                }
            }
            drawer {
                attrs {
                    width = 640
                    placement = "right"
                    closable = false
                    onClose = handleClose
                    visible = state.visible
                }
                styledP {
                    css {
                        +UserProfileStyles.pStyle
                        marginBottom = 24.px
                    }
                    +"User Profile"
                }
                styledP {
                    css { +UserProfileStyles.pStyle }
                    +"Personal"
                }
                row {
                    col {
                        attrs.span = 12
                        descriptionItem {
                            attrs {
                                title = "Full name"
                                content = "Lily"
                            }
                        }
                    }
                    col {
                        attrs.span = 12
                        descriptionItem {
                            attrs {
                                title = "Account"
                                content = "AntDesign@example.com"
                            }
                        }
                    }
                }
                row {
                    col {
                        attrs.span = 12
                        descriptionItem {
                            attrs {
                                title = "City"
                                content = "HangZhou"
                            }
                        }
                    }
                    col {
                        attrs.span = 12
                        descriptionItem {
                            attrs {
                                title = "Country"
                                content = "China\uD83C\uDDE8\uD83C\uDDF3"
                            }
                        }
                    }
                }
                row {
                    col {
                        attrs.span = 12
                        descriptionItem {
                            attrs {
                                title = "Birthday"
                                content = "February 2,1900"
                            }
                        }
                    }
                    col {
                        attrs.span = 12
                        descriptionItem {
                            attrs {
                                title = "Website"
                                content = "-"
                            }
                        }
                    }
                }
                row {
                    col {
                        attrs.span = 24
                        descriptionItem {
                            attrs {
                                title = "Message"
                                content = "Make things as simple as possible but no simpler."
                            }
                        }
                    }
                }
                divider {}
                styledP {
                    css { +UserProfileStyles.pStyle }
                    +"Company"
                }
                row {
                    col {
                        attrs.span = 12
                        descriptionItem {
                            attrs {
                                title = "Position"
                                content = "Programmer"
                            }
                        }
                    }
                    col {
                        attrs.span = 12
                        descriptionItem {
                            attrs {
                                title = "Responsibilities"
                                content = "Coding"
                            }
                        }
                    }
                }
                row {
                    col {
                        attrs.span = 12
                        descriptionItem {
                            attrs {
                                title = "Department"
                                content = "AFX"
                            }
                        }
                    }
                    col {
                        attrs.span = 12
                        descriptionItem {
                            attrs {
                                title = "Supervisor"
                                content = buildElement {
                                    a { +"Lin" }
                                }
                            }
                        }
                    }
                }
                row {
                    col {
                        attrs.span = 24
                        descriptionItem {
                            attrs {
                                title = "Skills"
                                content = "C / C + +, data structures, software engineering, operating systems, computer networks, databases, compiler theory, computer architecture, Microcomputer Principle and Interface Technology, Computer English, Java, ASP, etc."
                            }
                        }
                    }
                }
                divider {}
                styledP {
                    css { +UserProfileStyles.pStyle }
                    +"Contacts"
                }
                row {
                    col {
                        attrs.span = 12
                        descriptionItem {
                            attrs {
                                title = "Email"
                                content = "AntDesign@example.com"
                            }
                        }
                    }
                    col {
                        attrs.span = 12
                        descriptionItem {
                            attrs {
                                title = "Phone Number"
                                content = "+86 181 0000 0000"
                            }
                        }
                    }
                }
                row {
                    col {
                        attrs.span = 24
                        descriptionItem {
                            attrs {
                                title = "Github"
                                content = buildElement {
                                    a {
                                        attrs.href = "http://github.com/ant-design/ant-design/"
                                        +"github.com/ant-design/ant-design/"
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

fun RBuilder.userProfileApp() = child(UserProfileApp::class) {}

fun RBuilder.userProfile() {
    styledDiv {
        css { +DrawerStyles.userProfile }
        userProfileApp()
    }
}
