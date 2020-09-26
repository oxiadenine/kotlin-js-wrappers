package antd.result

import react.*

fun RBuilder.result(handler: RHandler<ResultProps>) = child(ResultComponent::class, handler)
