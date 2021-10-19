package antd.skeleton

import react.*

external interface SkeletonAvatarComponent : ComponentType<SkeletonAvatarProps>

external interface SkeletonAvatarProps : SkeletonElementProps, Props {
    override var shape: String? /* "circle" | "square" */
}
