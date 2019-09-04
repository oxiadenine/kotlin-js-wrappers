package antd.mention

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object NavComponent : Component<NavProps, RState> {
    override fun render(): ReactElement?
}

external interface NavProps : RProps {
    var value: Any?
    var data: Any?
    var disabled: Boolean?
}
