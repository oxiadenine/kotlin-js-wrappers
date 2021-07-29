package antd.skeleton

import react.*

external interface SkeletonInputComponent : ComponentType<SkeletonInputProps>

external interface SkeletonInputProps : SkeletonElementProps, RProps {
    override var size: dynamic /* "large" | "small" | "default" */
}
