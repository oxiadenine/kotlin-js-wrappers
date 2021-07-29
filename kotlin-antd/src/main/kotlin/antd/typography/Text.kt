package antd.typography

import react.*

external interface TextComponent : ComponentType<TextProps>

external interface TextProps : BlockProps, RProps {
    override var ellipsis: dynamic /* Boolean */
}
