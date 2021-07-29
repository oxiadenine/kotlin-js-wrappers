package antd.skeleton

import react.*

external interface SkeletonButtonComponent : ComponentType<SkeletonButtonProps>

external interface SkeletonButtonProps : SkeletonElementProps, RProps {
    override var size: dynamic /* "large" | "small" | "default" */
}
