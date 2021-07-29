package antd.skeleton

import react.*

external interface SkeletonElementComponent : ComponentType<SkeletonElementProps>

external interface SkeletonElementProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var size: Any? /* "large" | "small" | "default" | Number */
    var shape: String? /* "circle" | "square" | "round" */
    var active: Boolean?
}
