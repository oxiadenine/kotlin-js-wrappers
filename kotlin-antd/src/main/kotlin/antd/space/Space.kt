@file:JsModule("antd/lib/space")
@file:JsNonModule

package antd.space

import antd.ReactNode
import react.*

@JsName("default")
external object SpaceComponent : Component<SpaceProps, State> {
    override fun render(): ReactElement?
}

external interface SpaceProps : Props {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var size: Any? /* SizeType | Number */
    var direction: String? /* "horizontal" | "vertical" */
    var align: String? /*"start" | "end" | "center" | "baseline" */
    var split: ReactNode?
}

external val lastIndexContext: Context<Number>
