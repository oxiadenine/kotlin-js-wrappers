package antd.select

import antd.Key
import antd.ReactNode
import react.*

external object OptionComponent : Component<OptionProps, RState> {
    override fun render(): ReactElement?
}

external interface OptionProps : OptionCoreData, RProps {
    override var children: ReactNode?
}

external interface OptionCoreData {
    var key: Key?
    var disabled: Boolean?
    var value: Key
    var title: String?
    var className: String?
    var style: dynamic
    var label: ReactNode?
    var children: ReactNode?
}
