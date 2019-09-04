package antd.pagination

import antd.select.OptionComponent
import react.*

external object MiniSelectComponent : Component<RProps, RState> {
    val Option: OptionComponent

    override fun render(): ReactElement?
}
