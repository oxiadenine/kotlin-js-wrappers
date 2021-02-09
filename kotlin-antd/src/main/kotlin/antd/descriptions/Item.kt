package antd.descriptions

import react.*

external object DescriptionsItemComponent : Component<DescriptionsItemProps, RState> {
    override fun render(): ReactElement?
}

external interface DescriptionsItemProps : RProps {
    var prefixCls: String?
    var className: String?
    var label: Any? /* String | ReactElement */
    var children: Any? /* String | ReactElement */
    var span: Number?
}
