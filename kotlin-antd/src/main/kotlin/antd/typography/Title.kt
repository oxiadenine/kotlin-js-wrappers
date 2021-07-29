package antd.typography

import react.*

external interface TitleComponent : ComponentType<TitleProps>

external interface TitleProps : BlockProps, RProps {
    var level: Number?
}
