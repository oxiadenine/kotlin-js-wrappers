package antd.transfer

import react.RBuilder
import react.RHandler

fun RBuilder.transfer(handler: RHandler<TransferProps>) = child(TransferComponent::class, handler)
