package antd.timeline

import antd.ReactNode
import react.*

external interface TimelineItemComponent : ComponentClass<TimelineItemProps>

external interface TimelineItemProps : Props {
    var prefixCls: String?
    var className: String?
    var color: String?
    var dot: ReactNode?
    var pending: Boolean?
    var position: String?
    var style: dynamic
    var label: ReactNode?
}
