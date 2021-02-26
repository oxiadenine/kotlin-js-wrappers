package antd.select

import antd.Key
import antd.ReactNode
import react.*

external object OptionGroupComponent : Component<OptionGroupProps, RState> {
    override fun render(): ReactElement?
}

external interface OptionGroupProps : OptionGroupData, RProps {
    var children: ReactNode?
}

external interface OptionGroupData {
    var key: Key?
    var label: ReactNode?
    var options: Array<OptionData>
    var className: String?
    var style: dynamic
}
