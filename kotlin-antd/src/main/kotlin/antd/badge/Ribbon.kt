package antd.badge

import antd.ReactNode
import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object RibbonComponent : Component<RibbonProps, RState> {
    override fun render(): ReactElement?
}

external interface RibbonProps : RProps {
    var className: String?
    var prefixCls: String?
    var style: dynamic
    var text: ReactNode?
    var color: PresetColorType?
    var children: ReactNode?
    var placement: RibbonPlacement?
}
