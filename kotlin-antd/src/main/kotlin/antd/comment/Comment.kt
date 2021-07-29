@file:JsModule("antd/lib/comment")
@file:JsNonModule

package antd.comment

import antd.ReactNode
import react.*

@JsName("default")
external object CommentComponent : Component<CommentProps, State> {
    override fun render(): ReactElement?
}

external interface CommentProps : RProps {
    var actions: Array<ReactNode>?
    var author: ReactNode?
    var avatar: ReactNode?
    var className: String?
    var content: ReactNode
    var children: ReactNode
    var prefixCls: String?
    var style: dynamic
    var datetime: ReactNode?
}
