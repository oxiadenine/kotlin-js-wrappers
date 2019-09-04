package antd.select

import react.*

external object OptionGroupComponent : Component<OptionGroupProps, RState> {
    override fun render(): ReactElement?
}

external interface OptionGroupProps : RProps {
    var label: Any? /* String | ReactElement */
}
