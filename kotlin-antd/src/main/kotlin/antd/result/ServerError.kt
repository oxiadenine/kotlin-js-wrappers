package antd.result

import react.*

external object ServerErrorComponent : Component<ServerErrorProps, State> {
    override fun render(): ReactElement?
}

external interface ServerErrorProps : RProps
