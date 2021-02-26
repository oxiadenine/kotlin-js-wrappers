package antd.timeline

import antd.ReactNode
import react.*

external object TimelineItemComponent : Component<TimelineItemProps, RState> {
    override fun render(): ReactElement?
}

external interface TimelineItemProps : RProps {
    var prefixCls: String?
    var className: String?
    var color: String?
    var dot: ReactNode?
    var pending: Boolean?
    var position: String?
    var style: dynamic
    var label: ReactNode?
}
