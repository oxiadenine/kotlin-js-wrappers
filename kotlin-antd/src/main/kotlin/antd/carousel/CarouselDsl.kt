package antd.carousel

import react.*

fun RBuilder.carousel(handler: RHandler<CarouselProps>) = child(CarouselComponent::class, handler)
