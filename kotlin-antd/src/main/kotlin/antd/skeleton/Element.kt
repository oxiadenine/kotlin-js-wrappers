package antd.skeleton

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object SkeletonElementComponent : Component<SkeletonElementProps, RState> {
    override fun render(): ReactElement?
}

external interface SkeletonElementProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var size: Any? /* "large" | "small" | "default" | Number */
    var shape: String? /* "circle" | "square" | "round" */
    var active: Boolean?
}
