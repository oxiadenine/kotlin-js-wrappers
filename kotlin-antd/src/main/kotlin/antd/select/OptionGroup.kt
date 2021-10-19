package antd.select

import antd.Key
import antd.ReactNode
import react.*

external interface OptionGroupComponent : ComponentType<OptionGroupProps>

external interface OptionGroupProps : OptionGroupData, Props {
    var children: ReactNode?
}

external interface OptionGroupData {
    var key: Key?
    var label: ReactNode?
    var options: Array<OptionData>
    var className: String?
    var style: dynamic
}
