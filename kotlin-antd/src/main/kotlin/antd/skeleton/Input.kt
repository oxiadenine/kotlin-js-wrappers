package antd.skeleton

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object SkeletonInputComponent : Component<SkeletonInputProps, RState> {
    override fun render(): ReactElement?
}

external interface SkeletonInputProps : SkeletonElementProps, RProps {
    override var size: dynamic /* "large" | "small" | "default" */
}
