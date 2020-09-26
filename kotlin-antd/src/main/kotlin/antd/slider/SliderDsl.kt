package antd.slider

import react.*

fun RBuilder.slider(handler: RHandler<SliderProps>) = child(SliderComponent::class, handler)
