@file:JsModule("antd/lib/space")
@file:JsNonModule

package antd.space

import antd.ReactNode
import react.Component
import react.RContext
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object SpaceComponent : Component<SpaceProps, RState> {
    override fun render(): ReactElement?
}

external interface SpaceProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var size: Any? /* SizeType | Number */
    var direction: String? /* "horizontal" | "vertical" */
    var align: String? /*"start" | "end" | "center" | "baseline" */
    var split: ReactNode?
}

external val lastIndexContext: RContext<Number>
