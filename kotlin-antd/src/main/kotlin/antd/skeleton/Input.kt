package antd.skeleton

import react.*

external interface SkeletonInputComponent : ComponentClass<SkeletonInputProps>

external interface SkeletonInputProps : SkeletonElementProps, Props {
    override var size: dynamic /* "large" | "small" | "default" */
}
