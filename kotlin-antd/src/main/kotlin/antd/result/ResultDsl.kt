package antd.result

import react.RBuilder
import react.RHandler

fun RBuilder.result(handler: RHandler<ResultProps>) = child(ResultComponent::class, handler)
