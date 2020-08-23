package samples.pageheader

import antd.button.button
import antd.grid.col
import antd.grid.row
import antd.pageheader.pageHeader
import antd.statistic.statistic
import antd.tabs.tabPane
import antd.tabs.tabs
import antd.tag.tag
import kotlinx.html.classes
import kotlinx.html.id
import react.*
import react.dom.a
import react.dom.div
import kotlinx.browser.window

interface ActionsDescriptionProps : RProps {
    var term: String
    var children: Any
    var span: Number
}

class ActionsDescription : RComponent<ActionsDescriptionProps, RState>() {
    override fun RState.init(props: ActionsDescriptionProps) {
        props.span = 12
    }

    override fun RBuilder.render() {
        col {
            attrs.span = props.span
            div {
                attrs.classes = setOf("description")
                div {
                    attrs.classes = setOf("term")
                    +props.term
                }
                div {
                    attrs.classes = setOf("detail")
                    childList.add(props.children)
                }
            }
        }
    }
}

fun RBuilder.actionsDescription(handler: RHandler<ActionsDescriptionProps>) = child(ActionsDescription::class, handler)

private val content = buildElement {
    row {
        actionsDescription {
            attrs.term = "Created"
            +"Lili Qu"
        }
        actionsDescription {
            attrs.term = "Association"
            a { +"421421" }
        }
        actionsDescription {
            attrs.term = "Creation Tim"
            +"2017-01-10"
        }
        actionsDescription {
            attrs.term = "Effective Time"
            +"2017-10-10"
        }
        actionsDescription {
            attrs {
                term = "Remarks"
                span = 24
            }
            +"Gonghu Road, Xihu District, Hangzhou, Zhejiang, China"
        }
    }
}

private val extraContent = buildElement {
    row {
        col {
            attrs.span = 12
            statistic {
                attrs {
                    title = "Status"
                    value = "Pending"
                }
            }
        }
        col {
            attrs.span = 12
            statistic {
                attrs {
                    title = "Price"
                    prefix = "$"
                    value = 568.08
                }
            }
        }
    }
}

fun RBuilder.actions() {
    div("page-header-container") {
        attrs.id = "page-header-actions"
        pageHeader {
            attrs {
                onBack = { window.history.back() }
                title = "Title"
                subTitle = "This is a subtitle"
                tags = buildElement {
                    tag {
                        attrs.color = "red"
                        +"Warning"
                    }
                }
                extra = arrayOf(
                        buildElement {
                            button {
                                attrs.key = "3"
                                +"Operation"
                            }
                        },
                        buildElement {
                            button {
                                attrs.key = "2"
                                +"Operation"
                            }
                        },
                        buildElement {
                            button {
                                attrs {
                                    key = "1"
                                    type = "primary"
                                }
                                +"Primary"
                            }
                        }
                )
                footer = buildElement {
                    tabs {
                        attrs.defaultActiveKey = "1"
                        tabPane {
                            attrs {
                                tab = "Details"
                                key = "1"
                            }
                        }
                        tabPane {
                            attrs {
                                tab = "Rule"
                                key = "2"
                            }
                        }
                    }
                }
            }
            div {
                attrs.classes = setOf("wrap")
                div {
                    attrs.classes = setOf("content", "padding")
                    childList.add(content.unsafeCast<Any>())
                }
                div {
                    attrs.classes = setOf("extraContent")
                    childList.add(extraContent.unsafeCast<Any>())
                }
            }
        }
    }
}
