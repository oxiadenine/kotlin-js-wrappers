package antd.descriptions

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object DescriptionsItemComponent : Component<DescriptionsItemProps, RState> {
    override fun render(): ReactElement?
}

external interface DescriptionsItemProps : RProps {
    var prefixCls: String?
    var className: String?
    var label: Any? /* String | ReactElement */
    var children: ReactElement
    var span: Number?
}
