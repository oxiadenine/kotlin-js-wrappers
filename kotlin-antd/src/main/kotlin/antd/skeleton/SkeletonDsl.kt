package antd.skeleton

import react.*

fun RBuilder.skeleton(handler: RHandler<SkeletonProps>) = child(SkeletonComponent::class, handler)
