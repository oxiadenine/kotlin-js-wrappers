package antd.skeleton

import react.*

external interface SkeletonAvatarComponent : ComponentType<SkeletonAvatarProps>

external interface SkeletonAvatarProps : SkeletonElementProps, RProps {
    override var shape: String? /* "circle" | "square" */
}
