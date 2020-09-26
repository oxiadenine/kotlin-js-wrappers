package antd.timeline

import kotlinext.js.*
import react.*

fun RBuilder.timeline(handler: RHandler<TimelineProps>) = child(TimelineComponent::class, handler)
fun RBuilder.timelineItem(handler: RHandler<TimelineItemProps>) = child(TimelineComponent.Item, jsObject {}, handler)
