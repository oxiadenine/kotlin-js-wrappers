package antd.badge

import antd.ReactNode
import react.*

external interface RibbonComponent : ComponentType<RibbonProps>

external interface RibbonProps : Props {
    var className: String?
    var prefixCls: String?
    var style: dynamic
    var text: ReactNode?
    var color: PresetColorType?
    var children: ReactNode?
    var placement: RibbonPlacement?
}
