package antd.result

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object ServerErrorComponent : Component<ServerErrorProps, RState> {
    override fun render(): ReactElement?
}

external interface ServerErrorProps : RProps
