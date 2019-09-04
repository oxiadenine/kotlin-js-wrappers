package antd.slider

import react.RBuilder
import react.RHandler

fun RBuilder.slider(handler: RHandler<SliderProps>) = child(SliderComponent::class, handler)
