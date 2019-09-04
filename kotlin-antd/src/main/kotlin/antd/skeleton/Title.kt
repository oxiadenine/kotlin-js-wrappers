package antd.skeleton

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object SkeletonTitleComponent : Component<SkeletonTitleProps, RState> {
    override fun render(): ReactElement?
}

external interface SkeletonTitleProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var width: Any? /* Number | String */
}
