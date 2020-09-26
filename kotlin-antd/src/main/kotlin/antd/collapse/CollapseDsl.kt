package antd.collapse

import kotlinext.js.*
import react.*

fun RBuilder.collapse(handler: RHandler<CollapseProps>) = child(CollapseComponent::class, handler)
fun RBuilder.collapsePanel(handler: RHandler<CollapsePanelProps>) = child(CollapseComponent.Panel, jsObject {}, handler)
