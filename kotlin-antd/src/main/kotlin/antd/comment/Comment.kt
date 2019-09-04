@file:JsModule("antd/lib/comment")

package antd.comment

import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object CommentComponent : Component<CommentProps, RState> {
    override fun render(): ReactElement?
}

external interface CommentProps : RProps {
    var actions: Array<Any /* String | ReactElement */>?
    var author: Any? /* String | ReactElement */
    var avatar: Any? /* String | ReactElement */
    var className: String?
    var content: Any /* String | ReactElement */
    var children: ReactElement?
    var prefixCls: String?
    var style: dynamic
    var datetime: Any? /* String | ReactElement */
}
