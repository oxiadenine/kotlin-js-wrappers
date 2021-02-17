package antd.skeleton

import react.*

external object SkeletonAvatarComponent : Component<SkeletonAvatarProps, RState> {
    override fun render(): ReactElement?
}

external interface SkeletonAvatarProps : SkeletonElementProps, RProps {
    override var shape: String? /* "circle" | "square" */
}
