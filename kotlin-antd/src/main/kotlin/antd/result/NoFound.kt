package antd.result

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object NoFoundComponent : Component<NoFoundProps, RState> {
    override fun render(): ReactElement?
}

external interface NoFoundProps : RProps
