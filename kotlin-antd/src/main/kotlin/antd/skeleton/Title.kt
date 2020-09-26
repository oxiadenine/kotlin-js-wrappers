package antd.skeleton

import react.*

external object SkeletonTitleComponent : Component<SkeletonTitleProps, RState> {
    override fun render(): ReactElement?
}

external interface SkeletonTitleProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var width: Any? /* Number | String */
}
