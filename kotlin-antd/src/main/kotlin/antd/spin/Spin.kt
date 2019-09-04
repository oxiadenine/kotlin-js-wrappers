@file:JsModule("antd/lib/spin")

package antd.spin

import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object SpinComponent : Component<SpinProps, SpinState> {
    override fun render(): ReactElement?
}

external interface SpinProps : RProps {
    var prefixCls: String?
    var className: String?
    var spinning: Boolean?
    var style: dynamic
    var size: SpinSize?
    var tip: String?
    var delay: Number?
    var wrapperClassName: String?
    var indicator: SpinIndicator?
}

external interface SpinState : RState {
    var spinning: Boolean?
    var notCssAnimationSupported: Boolean?
}
