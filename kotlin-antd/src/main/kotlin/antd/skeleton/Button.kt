package antd.skeleton

import react.*

external interface SkeletonButtonComponent : ComponentClass<SkeletonButtonProps>

external interface SkeletonButtonProps : SkeletonElementProps, Props {
    override var size: dynamic /* "large" | "small" | "default" */
}
