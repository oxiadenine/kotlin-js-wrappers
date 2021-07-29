package antd.button

import antd.configprovider.SizeType
import react.*

external interface ButtonGroupComponent : ComponentType<ButtonGroupProps>

external interface ButtonGroupProps : RProps {
    var size: SizeType?
    var style: dynamic
    var className: String?
    var prefixCls: String?
}
