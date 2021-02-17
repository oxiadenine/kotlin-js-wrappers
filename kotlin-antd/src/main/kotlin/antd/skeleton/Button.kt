package antd.skeleton

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object SkeletonButtonComponent : Component<SkeletonButtonProps, RState> {
    override fun render(): ReactElement?
}

external interface SkeletonButtonProps : SkeletonElementProps, RProps {
    override var size: dynamic /* "large" | "small" | "default" */
}
