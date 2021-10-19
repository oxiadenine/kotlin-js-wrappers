@file:JsModule("antd/lib/rate")
@file:JsNonModule

package antd.rate

import antd.RefAttributes
import antd.ReactNode
import react.*

@JsName("default")
external object RateComponent : Component<RateProps, State> {
    override fun render(): ReactElement?
}

external interface RateProps : RefAttributes<dynamic>, Props {
    var prefixCls: String?
    var count: Number?
    var value: Number?
    var defaultValue: Number?
    var allowHalf: Boolean?
    var allowClear: Boolean?
    var disabled: Boolean?
    var tooltips: Array<String>?
    var onChange: ((value: Number) -> Unit)?
    var onHoverChange: ((value: Number) -> Unit)?
    var character: ReactNode?
    var className: String?
    var style: dynamic
}
