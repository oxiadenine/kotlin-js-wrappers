package antd.typography

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object ParagraphComponent : Component<ParagraphProps, RState> {
    override fun render(): ReactElement?
}

external interface ParagraphProps : BlockProps, RProps
