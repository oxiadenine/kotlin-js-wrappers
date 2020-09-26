package antd.typography

import react.*

external object ParagraphComponent : Component<ParagraphProps, RState> {
    override fun render(): ReactElement?
}

external interface ParagraphProps : BlockProps, RProps
