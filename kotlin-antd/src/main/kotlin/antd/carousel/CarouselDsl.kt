package antd.carousel

import react.RBuilder
import react.RHandler

fun RBuilder.carousel(handler: RHandler<CarouselProps>) = child(CarouselComponent::class, handler)
