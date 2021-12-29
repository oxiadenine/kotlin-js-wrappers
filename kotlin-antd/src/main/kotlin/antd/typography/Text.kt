package antd.typography

import react.*

external interface TextComponent : ComponentClass<TextProps>

external interface TextProps : BlockProps, Props {
    override var ellipsis: dynamic /* Boolean */
}
