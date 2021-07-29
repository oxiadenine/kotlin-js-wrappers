package samples.comment

import antd.comment.CommentProps
import antd.comment.comment
import antd.list.ListComponent
import antd.list.list
import antd.tooltip.tooltip
import kotlinext.js.jsObject
import moment.moment
import react.RBuilder
import react.buildElement
import react.dom.li
import react.dom.p
import react.dom.span
import styled.css
import styled.styledDiv

private val data = arrayOf<CommentProps>(
    jsObject {
        actions = arrayOf(buildElement {
            span { +"Reply to" }
        })
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
        }
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
        })
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
        }
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
    styledDiv {
        css { +CommentStyles.list }
        list<CommentProps, ListComponent<CommentProps>> {
            attrs {
                className = "comment-list"
                header = "${data.size} replies"
                itemLayout = "horizontal"
                dataSource = data
                renderItem = { item, _ ->
                    buildElement {
                        li {
                            comment {
                                attrs {
                                    actions = item.actions
                                    author = item.author
                                    avatar = item.avatar
                                    content = item.content
                                    datetime = item.datetime
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
