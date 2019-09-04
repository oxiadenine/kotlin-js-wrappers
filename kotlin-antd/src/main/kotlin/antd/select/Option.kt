package antd.select

import react.*

external object OptionComponent : Component<OptionProps, RState> {
    override fun render(): ReactElement?
}

external interface OptionProps : RProps {
    var disabled: Boolean?
    var value: Any? /* String | Number */
    var title: String?
    var children: ReactElement?
    var className: String?
    var style: dynamic
    var text: String?
    var label: Any? /* String | ReactElement */
}
