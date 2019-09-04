package samples.comment

import antd.comment.CommentProps
import antd.comment.comment
import antd.list.list
import antd.tooltip.tooltip
import kotlinext.js.jsObject
import kotlinx.html.id
import moment.moment
import react.*
import react.dom.*

private val data = arrayOf<CommentProps>(
        jsObject {
            actions = arrayOf(buildElement {
                span { +"Reply to" }
            }!!)
            author = "Han Solo"
            avatar = "https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"
            content = buildElement {
                p {
                    +"""
                        We supply a series of design principles, practical patterns and high quality design
                        resources (Sketch and Axure), to help people create their product prototypes beautifully and
                        efficiently.
                    """.trimIndent()
                }
            }!!
            datetime = buildElement {
                tooltip {
                    attrs.title = moment()
                            .subtract(1, "days")
                            .format("YYYY-MM-DD HH:mm:ss")
                    span {
                        +moment().subtract(1, "days").fromNow()
                    }
                }
            }
        },
        jsObject {
            actions = arrayOf(buildElement {
                span { +"Reply to" }
            }!!)
            author = "Han Solo"
            avatar = "https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"
            content = buildElement {
                p {
                    +"""
                        We supply a series of design principles, practical patterns and high quality design
                        resources (Sketch and Axure), to help people create their product prototypes beautifully and
                        efficiently.
                    """.trimIndent()
                }
            }!!
            datetime = buildElement {
                tooltip {
                    attrs.title = moment()
                            .subtract(2, "days")
                            .format("YYYY-MM-DD HH:mm:ss")
                    span {
                        +moment().subtract(2, "days").fromNow()
                    }
                }
            }
        }
)

fun RBuilder.list() {
    div("comment-container") {
        attrs.id = "comment-list"
        list {
            attrs {
                className = "comment-list"
                header = "${data.size} replies"
                itemLayout = "horizontal"
                dataSource = data.unsafeCast<Array<Any>>()
                renderItem = { item, _ ->
                    val commentProps = item.unsafeCast<CommentProps>()

                    li {
                        comment {
                            attrs {
                                actions = commentProps.actions
                                author = commentProps.author
                                avatar = commentProps.avatar
                                content = commentProps.content
                                datetime = commentProps.datetime
                            }
                        }
                    }
                }
            }
        }
    }
}
