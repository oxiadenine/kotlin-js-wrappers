package antd.badge

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object ScrollNumberComponent : Component<ScrollNumberProps, ScrollNumberState> {
    override fun render(): ReactElement?
}

external interface ScrollNumberProps : RProps {
    var prefixCls: String?
    var className: String?
    var count: Any? /* String | Number */
    var displayComponent: ReactElement?
    var component: String?
    var onAnimated: Function<Any>?
    var style: dynamic
    var title: Any? /* String | Number */
}

external interface ScrollNumberState : RState {
    var animateStarted: Boolean?
    var count: Any? /* String | Number */
}
