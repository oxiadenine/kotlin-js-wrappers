package antd.skeleton

import react.*

external interface SkeletonTitleComponent : ComponentType<SkeletonTitleProps>

external interface SkeletonTitleProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var width: Any? /* Number | String */
}
