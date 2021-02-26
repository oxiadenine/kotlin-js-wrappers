package antd.descriptions

import antd.ReactNode
import react.*

external object DescriptionsItemComponent : Component<DescriptionsItemProps, RState> {
    override fun render(): ReactElement?
}

external interface DescriptionsItemProps : RProps {
    var prefixCls: String?
    var className: String?
    var label: ReactNode?
    var children: ReactNode?
    var span: Number?
}
