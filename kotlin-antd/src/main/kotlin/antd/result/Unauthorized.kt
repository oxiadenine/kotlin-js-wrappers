package antd.result

import react.*

external object UnauthorizedComponent : Component<UnauthorizedProps, State> {
    override fun render(): ReactElement?
}

external interface UnauthorizedProps : Props
