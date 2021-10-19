package antd.skeleton

import react.*

external interface SkeletonTitleComponent : ComponentType<SkeletonTitleProps>

external interface SkeletonTitleProps : Props {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var width: Any? /* Number | String */
}
