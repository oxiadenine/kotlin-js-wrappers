package antd.mentions

import react.*

external object OptionComponent : Component<OptionProps, RState> {
    override fun render(): ReactElement?
}

external interface OptionProps : RcOptionProps, RProps {
    override var value: String
    override var children: ReactElement
    /* [key: String]: Any */
}

external interface RcOptionProps {
    var value: String
    var disabled: Boolean?
    var children: ReactElement
    var className: String?
    var style: dynamic
}
