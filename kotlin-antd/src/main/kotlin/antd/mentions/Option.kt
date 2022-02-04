package antd.mentions

import antd.ReactNode
import react.*

external interface OptionComponent : ComponentClass<OptionProps>

external interface OptionProps : RcOptionProps, Props {
    override var value: String?
    override var children: ReactNode?
}

external interface RcOptionProps {
    var value: String?
    var key: String?
    var disabled: Boolean?
    var children: ReactNode?
    var className: String?
    var style: dynamic
}
