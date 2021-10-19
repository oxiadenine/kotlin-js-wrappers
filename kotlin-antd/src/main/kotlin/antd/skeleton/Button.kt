package antd.skeleton

import react.*

external interface SkeletonButtonComponent : ComponentType<SkeletonButtonProps>

external interface SkeletonButtonProps : SkeletonElementProps, Props {
    override var size: dynamic /* "large" | "small" | "default" */
}
