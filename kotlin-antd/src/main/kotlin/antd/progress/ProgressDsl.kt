package antd.progress

import react.*

fun RBuilder.progress(handler: RHandler<ProgressProps>) = child(ProgressComponent::class, handler)
