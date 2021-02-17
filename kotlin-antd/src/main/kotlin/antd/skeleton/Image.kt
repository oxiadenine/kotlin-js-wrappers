package antd.skeleton

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object SkeletonImageComponent : Component<SkeletonImageProps, RState> {
    override fun render(): ReactElement?
}

external interface SkeletonImageProps : SkeletonElementProps, RProps
