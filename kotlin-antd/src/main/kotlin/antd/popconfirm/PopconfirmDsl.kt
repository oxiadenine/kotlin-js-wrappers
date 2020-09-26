package antd.popconfirm

import react.*

fun RBuilder.popconfirm(handler: RHandler<PopconfirmProps>) = child(PopconfirmComponent::class, handler)
