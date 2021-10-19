package antd.result

import react.*

external object NoFoundComponent : Component<NoFoundProps, State> {
    override fun render(): ReactElement?
}

external interface NoFoundProps : Props
