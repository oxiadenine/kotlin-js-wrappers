package antd.skeleton

import react.*

external object SkeletonAvatarComponent : Component<SkeletonAvatarProps, RState> {
    override fun render(): ReactElement?
}

external interface SkeletonAvatarProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var size: SkeletonAvatarSize?
    var shape: SkeletonAvatarShape?
}
