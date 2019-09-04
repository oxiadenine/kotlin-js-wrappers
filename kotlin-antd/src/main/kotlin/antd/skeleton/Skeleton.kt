@file:JsModule("antd/lib/skeleton")

package antd.skeleton

import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object SkeletonComponent : Component<SkeletonProps, RState> {
    override fun render(): ReactElement?
}

external interface SkeletonProps : RProps {
    var active: Boolean?
    var loading: Boolean?
    var prefixCls: String?
    var className: String?
    var children: ReactElement?
    var avatar: Any? /* SkeletonAvatarProps | Boolean */
    var title: Any? /* SkeletonTitleProps | Boolean */
    var paragraph: Any? /* SkeletonParagraphProps | Boolean */
}
