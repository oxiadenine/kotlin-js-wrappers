package antd.autocomplete

import react.*

external object InputElementComponent : Component<InputElementProps, RState> {
    override fun render(): ReactElement?
}

external interface InputElementProps : RProps {
    var children: ReactElement
}
