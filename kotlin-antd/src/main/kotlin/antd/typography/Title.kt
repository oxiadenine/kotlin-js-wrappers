package antd.typography

import react.*

external interface TitleComponent : ComponentClass<TitleProps>

external interface TitleProps : BlockProps, Props {
    var level: Number?
}
