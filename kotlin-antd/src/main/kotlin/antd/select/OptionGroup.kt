package antd.select

import react.*

external object OptionGroupComponent : Component<OptionGroupProps, RState> {
    override fun render(): ReactElement?
}

external interface OptionGroupProps : OptionGroupData, RProps {
    var children: Any? /* String | ReactElement */
}

external interface OptionGroupData {
    var key: Key?
    var label: Any? /* String | ReactElement */
    var options: Array<OptionData>
    var className: String?
    var style: dynamic
}
