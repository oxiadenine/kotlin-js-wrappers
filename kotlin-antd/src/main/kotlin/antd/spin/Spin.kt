@file:JsModule("antd/lib/spin")
@file:JsNonModule

package antd.spin

import react.*

@JsName("default")
external object SpinComponent : Component<SpinProps, SpinState> {
    override fun render(): ReactElement?
}

external interface SpinProps : Props {
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

external interface SpinState : State {
    var spinning: Boolean?
    var notCssAnimationSupported: Boolean?
}
