package antd.typography

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object TextComponent : Component<TextProps, RState> {
    override fun render(): ReactElement?
}

external interface TextProps : BlockProps, RProps {
    override var ellipsis: dynamic /* Boolean */
}
