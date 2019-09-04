package antd.popconfirm

import react.RBuilder
import react.RHandler

fun RBuilder.popconfirm(handler: RHandler<PopconfirmProps>) = child(PopconfirmComponent::class, handler)
