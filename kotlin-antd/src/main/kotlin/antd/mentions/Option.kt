package antd.mentions

import antd.ReactNode
import react.*

external object OptionComponent : Component<OptionProps, RState> {
    override fun render(): ReactElement?
}

external interface OptionProps : RcOptionProps, RProps {
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
