package antd.result

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object UnauthorizedComponent : Component<UnauthorizedProps, RState> {
    override fun render(): ReactElement?
}

external interface UnauthorizedProps : RProps
