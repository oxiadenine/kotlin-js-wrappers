package antd.mentions

import react.*

external object OptionComponent : Component<OptionProps, RState> {
    override fun render(): ReactElement?
}

external interface OptionProps : RcOptionProps, RProps {
    override var value: String?
    override var children: Any? /* String | ReactElement */
}

external interface RcOptionProps {
    var value: String?
    var key: String?
    var disabled: Boolean?
    var children: Any? /* String | ReactElement */
    var className: String?
    var style: dynamic
}
