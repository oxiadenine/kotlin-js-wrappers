package antd.typography

import react.*

external object TextComponent : Component<TextProps, RState> {
    override fun render(): ReactElement?
}

external interface TextProps : BlockProps, RProps {
    override var ellipsis: dynamic /* Boolean */
}
