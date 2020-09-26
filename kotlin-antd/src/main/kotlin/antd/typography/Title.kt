package antd.typography

import react.*

external object TitleComponent : Component<TitleProps, RState> {
    override fun render(): ReactElement?
}

external interface TitleProps : BlockProps, RProps {
    var level: Number?
}
