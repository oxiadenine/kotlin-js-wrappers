package antd.select

import react.*

external object OptionComponent : Component<OptionProps, RState> {
    override fun render(): ReactElement?
}

external interface OptionProps : OptionCoreData, RProps {
    override var children: Any? /* String | ReactElement */
}

external interface OptionCoreData {
    var key: Key?
    var disabled: Boolean?
    var value: Key
    var title: String?
    var className: String?
    var style: dynamic
    var label: Any? /* String | ReactElement */
    var children: Any? /* String | ReactElement */
}
