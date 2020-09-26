package samples.comment

import antd.*
import antd.avatar.*
import antd.comment.*
import antd.icon.*
import antd.tooltip.*
import kotlinext.js.*
import moment.*
import org.w3c.dom.*
import react.*
import react.dom.*
import styled.*

interface BasicAppState : RState {
    var likes: Number
    var dislikes: Number
    var action: String?
}

class BasicApp : RComponent<RProps, BasicAppState>() {
    private val like: MouseEventHandler<HTMLElement> = {
        setState {
            likes = 1
            dislikes = 0
            action = "liked"
        }
    }

    private val dislike: MouseEventHandler<HTMLElement> = {
        setState {
            likes = 0
            dislikes = 1
            action = "disliked"
        }
    }

    override fun BasicAppState.init() {
        likes = 0
        dislikes = 0
        action = null
    }

    override fun RBuilder.render() {
        val commnetActions = arrayOf(
            buildElement {
                span {
                    tooltip {
                        attrs.title = "Like"
                        icon {
                            attrs {
                                type = "like"
                                theme = if (state.action == "liked") "filled" else "outlined"
                                onClick = like
                            }
                        }
                    }
                    span {
                        attrs.jsStyle = js {
                            paddingLeft = 8
                            cursor = "auto"
                        }
                        +"${state.likes}"
                    }
                }
            },
            buildElement {
                span {
                    tooltip {
                        attrs.title = "Dislike"
                        icon {
                            attrs {
                                type = "dislike"
                                theme = if (state.action == "disliked") "filled" else "outlined"
                                onClick = dislike
                            }
                        }
                    }
                    span {
                        attrs.jsStyle = js {
                            paddingLeft = 8
                            cursor = "auto"
                        }
                        +"${state.dislikes}"
                    }
                }
            },
            buildElement {
                span { +"Reply to" }
            }
        ).unsafeCast<Array<Any>>()

        comment {
            attrs {
                actions = commnetActions
                author = buildElement {
                    a { +"Han Solo" }
                }
                avatar = buildElement {
                    avatar {
                        attrs {
                            src = "https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"
                            alt = "Han Solo"
                        }
                    }
                }
                content = buildElement {
                    p {
                        +"""
                            We supply a series of design principles, practical patterns and high quality design
                            resources (Sketch and Axure), to help people create their product prototypes beautifully
                            and efficiently.
                        """.trimIndent()
                    }
                }
                datetime = buildElement {
                    tooltip {
                        attrs.title = moment().format("YYYY-MM-DD HH:mm:ss")
                        span { +moment().fromNow() }
                    }
                }
            }
        }
    }
}

fun RBuilder.basicApp() = child(BasicApp::class) {}

fun RBuilder.basic() {
    styledDiv {
        css { +CommentStyles.basic }
        basicApp()
    }
}
