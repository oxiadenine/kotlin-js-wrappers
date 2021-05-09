package samples.comment

import antd.avatar.*
import antd.comment.*
import antd.icon.*
import antd.tooltip.*
import kotlinx.css.Cursor
import kotlinx.css.cursor
import kotlinx.css.paddingLeft
import kotlinx.css.px
import kotlinx.html.js.*
import moment.*
import org.w3c.dom.events.*
import react.*
import react.dom.*
import styled.*

external interface BasicAppState : RState {
    var likes: Number
    var dislikes: Number
    var action: String?
}

class BasicApp : RComponent<RProps, BasicAppState>() {
    private val like = { _: Event ->
        setState {
            likes = 1
            dislikes = 0
            action = "liked"
        }
    }

    private val dislike = { _: Event ->
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
        val commentActions = arrayOf(
            buildElement {
                span {
                    tooltip {
                        attrs.title = "Like"
                        span {
                            attrs.onClickFunction = like
                            if (state.action == "liked") {
                                likeFilled {}
                            } else likeOutlined {}
                        }
                    }
                    styledSpan {
                        css {
                            paddingLeft = 8.px
                            cursor = Cursor.auto
                        }
                        +"${state.likes}"
                    }
                }
            },
            buildElement {
                span {
                    tooltip {
                        attrs.title = "Dislike"
                        span {
                            attrs.onClickFunction = dislike
                            if (state.action == "disliked") {
                                dislikeFilled {}
                            } else dislikeOutlined {}
                        }
                    }
                    styledSpan {
                        css {
                            paddingLeft = 8.px
                            cursor = Cursor.auto
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
                actions = commentActions
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
