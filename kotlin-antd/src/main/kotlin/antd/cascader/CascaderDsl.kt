package antd.cascader

import react.*

fun RBuilder.cascader(handler: RHandler<CascaderProps>) = child(CascaderComponent::class, handler)
