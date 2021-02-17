@file:JsModule("antd/lib/rate")
@file:JsNonModule

package antd.rate

import react.*

@JsName("default")
external object RateComponent : Component<RateProps, RState> {
    override fun render(): ReactElement?
}

external interface RateProps : RProps {
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
    var character: Any? /* String | ReactElement */
    var className: String?
    var style: dynamic
}
