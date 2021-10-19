@file:JsModule("antd/lib/avatar")
@file:JsNonModule

package antd.avatar

import antd.ReactNode
import antd.RefAttributes
import react.*

@JsName("default")
external object AvatarComponent : Component<AvatarProps, AvatarState> {
    val Group: GroupComponent

    override fun render(): ReactElement
}

external interface AvatarProps : RefAttributes<dynamic>, Props {
    var shape: String? /* "circle" | "square" */
    var size: Any? /* AvatarSize | Number */
    var gap: Number?
    var src: ReactNode?
    var srcSet: String?
    var draggable: Boolean?
    var icon: ReactNode?
    var style: dynamic
    var prefixCls: String?
    var className: String?
    var children: ReactNode?
    var alt: String?
    var onError: (() -> Boolean)?
}

external interface AvatarState : State {
    var scale: Number
    var isImgExist: Boolean
}
