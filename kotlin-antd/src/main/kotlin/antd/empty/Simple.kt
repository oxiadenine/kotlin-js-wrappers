package antd.empty

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object SimpleComponent : Component<SimpleProps, RState> {
    override fun render(): ReactElement?
}

external interface SimpleProps : RProps
