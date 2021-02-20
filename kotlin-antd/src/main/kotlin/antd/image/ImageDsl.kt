package antd.image

import react.RBuilder
import react.RHandler

fun RBuilder.image(handler: RHandler<ImageProps>) = child(ImageComponent::class, handler)
