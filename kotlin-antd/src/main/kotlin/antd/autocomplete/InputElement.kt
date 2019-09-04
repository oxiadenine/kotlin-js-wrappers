package antd.autocomplete

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object InputElementComponent : Component<InputElementProps, RState> {
    override fun render(): ReactElement?
}

external interface InputElementProps : RProps {
    var children: ReactElement
}
