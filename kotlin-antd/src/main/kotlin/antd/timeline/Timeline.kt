@file:JsModule("antd/lib/timeline")

package antd.timeline

import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object TimelineComponent : Component<TimelineProps, RState> {
    val Item: TimelineItemComponent

    override fun render(): ReactElement?
}

external interface TimelineProps : RProps {
    var prefixCls: String?
    var className: String?
    var pending: Any? /* String | ReactElement */
    var pendingDot: Any? /* String | ReactElement */
    var style: dynamic
    var reverse: Boolean?
    var mode: TimelineMode?
}
