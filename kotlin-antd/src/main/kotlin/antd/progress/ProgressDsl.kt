package antd.progress

import react.RBuilder
import react.RHandler

fun RBuilder.progress(handler: RHandler<ProgressProps>) = child(ProgressComponent::class, handler)
