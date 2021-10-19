package antd.pagination

import antd.select.*
import react.*

external object MiniSelectComponent : Component<Props, State> {
    val Option: OptionComponent

    override fun render(): ReactElement?
}
