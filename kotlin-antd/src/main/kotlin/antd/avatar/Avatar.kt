@file:JsModule("antd/lib/avatar")
@file:JsNonModule

package antd.avatar

import react.*

@JsName("default")
external object AvatarComponent : Component<AvatarProps, AvatarState> {
    val Group: GroupComponent

    override fun render(): ReactElement
}

external interface AvatarProps : RProps {
    var shape: String? /* "circle" | "square" */
    var size: Any? /* AvatarSize | Number */
    var gap: Number?
    var src: Any? /* String | ReactElement */
    var srcSet: String?
    var draggable: Boolean?
    var icon: Any? /* String | ReactElement */
    var style: dynamic
    var prefixCls: String?
    var className: String?
    var children: Any? /* String | ReactElement */
    var alt: String?
    var onError: (() -> Boolean)?
}

external interface AvatarState : RState {
    var scale: Number
    var isImgExist: Boolean
}
