package antd.timeline

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.timeline(handler: RHandler<TimelineProps>) = child(TimelineComponent::class, handler)
fun RBuilder.timelineItem(handler: RHandler<TimelineItemProps>) = child(TimelineComponent.Item, jsObject {}, handler)
