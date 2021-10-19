package antd.descriptions

import antd.ReactNode
import react.*

external interface DescriptionsItemComponent : ComponentType<DescriptionsItemProps>

external interface DescriptionsItemProps : Props {
    var prefixCls: String?
    var className: String?
    var label: ReactNode?
    var children: ReactNode?
    var span: Number?
}
