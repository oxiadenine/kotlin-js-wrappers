package antd.mention

import react.*

external object NavComponent : Component<NavProps, RState> {
    override fun render(): ReactElement?
}

external interface NavProps : RProps {
    var value: Any?
    var data: Any?
    var disabled: Boolean?
}
