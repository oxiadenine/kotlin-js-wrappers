package antd.empty

import react.*

external object SimpleComponent : Component<SimpleProps, State> {
    override fun render(): ReactElement?
}

external interface SimpleProps : RProps
