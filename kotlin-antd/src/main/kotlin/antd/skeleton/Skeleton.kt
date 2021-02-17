@file:JsModule("antd/lib/skeleton")
@file:JsNonModule

package antd.skeleton

import react.*

@JsName("default")
external object SkeletonComponent : Component<SkeletonProps, RState> {
    val Button: SkeletonButtonComponent
    val Avatar: SkeletonAvatarComponent
    val Input: SkeletonInputComponent
    val Image: SkeletonImageComponent

    override fun render(): ReactElement?
}

external interface SkeletonProps : RProps {
    var active: Boolean?
    var loading: Boolean?
    var prefixCls: String?
    var className: String?
    var children: Any? /* String | ReactElement */
    var avatar: Any? /* SkeletonAvatarProps | Boolean */
    var title: Any? /* SkeletonTitleProps | Boolean */
    var paragraph: Any? /* SkeletonParagraphProps | Boolean */
    var round: Boolean?
}
