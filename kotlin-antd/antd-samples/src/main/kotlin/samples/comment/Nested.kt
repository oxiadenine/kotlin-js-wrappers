package samples.comment

import antd.avatar.*
import antd.comment.*
import react.*
import react.dom.*
import styled.*

external interface ExampleCommentProps : RProps {
    var children: ReactElement
}

class ExampleComment : RComponent<ExampleCommentProps, RState>() {
    override fun RBuilder.render() {
        comment {
            attrs {
                actions = arrayOf(buildElement {
                    span { +"Reply to" }
                })
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
                            resources (Sketch and Axure).
                        """.trimIndent()
                    }
                }
            }
            childList.add(props.children)
        }
    }
}

fun RBuilder.exampleComment(handler: RHandler<ExampleCommentProps>) = child(ExampleComment::class, handler)

fun RBuilder.nested() {
    styledDiv {
        css { +CommentStyles.nested }
        exampleComment {
            exampleComment {
                exampleComment {}
                exampleComment {}
            }
        }
    }
}
