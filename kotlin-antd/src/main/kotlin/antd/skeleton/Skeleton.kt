@file:JsModule("antd/lib/skeleton")
@file:JsNonModule

package antd.skeleton

import antd.ReactNode
import react.*

@JsName("default")
external object SkeletonComponent : Component<SkeletonProps, State> {
    val Button: SkeletonButtonComponent
    val Avatar: SkeletonAvatarComponent
    val Input: SkeletonInputComponent
    val Image: SkeletonImageComponent

    override fun render(): ReactElement?
}

external interface SkeletonProps : Props {
    var active: Boolean?
    var loading: Boolean?
    var prefixCls: String?
    var className: String?
    var children: ReactNode?
    var avatar: Any? /* SkeletonAvatarProps | Boolean */
    var title: Any? /* SkeletonTitleProps | Boolean */
    var paragraph: Any? /* SkeletonParagraphProps | Boolean */
    var round: Boolean?
}
