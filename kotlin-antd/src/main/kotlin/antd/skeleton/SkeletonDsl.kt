package antd.skeleton

import react.RBuilder
import react.RHandler

fun RBuilder.skeleton(handler: RHandler<SkeletonProps>) = child(SkeletonComponent::class, handler)
