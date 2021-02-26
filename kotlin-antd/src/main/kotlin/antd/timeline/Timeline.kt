@file:JsModule("antd/lib/timeline")
@file:JsNonModule

package antd.timeline

import antd.ReactNode
import react.*

@JsName("default")
external object TimelineComponent : Component<TimelineProps, RState> {
    val Item: TimelineItemComponent

    override fun render(): ReactElement?
}

external interface TimelineProps : RProps {
    var prefixCls: String?
    var className: String?
    var pending: ReactNode?
    var pendingDot: ReactNode?
    var style: dynamic
    var reverse: Boolean?
    var mode: String? /* "left" | "alternate" | "right" */
}
