package antd.cascader

import react.RBuilder
import react.RHandler

fun RBuilder.cascader(handler: RHandler<CascaderProps>) = child(CascaderComponent::class, handler)
