package antd.comment

import react.*

fun RBuilder.comment(handler: RHandler<CommentProps>) = child(CommentComponent::class, handler)
