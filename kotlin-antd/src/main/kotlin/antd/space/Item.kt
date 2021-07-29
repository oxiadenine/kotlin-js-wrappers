package antd.space

import antd.ReactNode
import react.*

external object ItemComponent : Component<ItemProps, State> {
    override fun render(): ReactElement?
}

external interface ItemProps : RProps {
    var className: String
    var children: ReactNode
    var index: Number
    var direction: String? /* "horizontal" | "vertical" */
    var size: Any? /* SizeType | Number */
    var marginDirection: String /* "marginLeft" | "marginRight" */
    var split: ReactNode?
}
