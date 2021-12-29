package antd.button

import antd.configprovider.SizeType
import react.*

external interface ButtonGroupComponent : ComponentClass<ButtonGroupProps>

external interface ButtonGroupProps : Props {
    var size: SizeType?
    var style: dynamic
    var className: String?
    var prefixCls: String?
}
