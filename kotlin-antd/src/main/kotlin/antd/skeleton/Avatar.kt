package antd.skeleton

import react.*

external interface SkeletonAvatarComponent : ComponentClass<SkeletonAvatarProps>

external interface SkeletonAvatarProps : SkeletonElementProps, Props {
    override var shape: String? /* "circle" | "square" */
}
