package antd.pagination

import antd.select.*
import react.*

external object MiniSelectComponent : Component<RProps, State> {
    val Option: OptionComponent

    override fun render(): ReactElement?
}
