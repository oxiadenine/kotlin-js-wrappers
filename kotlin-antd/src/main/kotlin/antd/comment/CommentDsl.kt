package antd.comment

import react.RBuilder
import react.RHandler

fun RBuilder.comment(handler: RHandler<CommentProps>) = child(CommentComponent::class, handler)
