@file:JsModule("antd/lib/avatar")

package antd.avatar

import react.*

@JsName("default")
external object AvatarComponent : Component<AvatarProps, AvatarState> {
    override fun render(): ReactElement
}

external interface AvatarProps : RProps {
    var shape: AvatarShape?
    var size: Any? /* AvatarSize | Number */
    var src: String?
    var srcSet: String?
    var icon: String?
    var style: dynamic
    var prefixCls: String?
    var className: String?
    var children: ReactElement?
    var alt: String?
    var onError: (() -> Boolean)?
}

external interface AvatarState : RState {
    var scale: Number
    var isImgExist: Boolean
}
