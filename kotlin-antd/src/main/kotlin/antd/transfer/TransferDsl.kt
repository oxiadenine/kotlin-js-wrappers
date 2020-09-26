package antd.transfer

import react.*

fun RBuilder.transfer(handler: RHandler<TransferProps>) = child(TransferComponent::class, handler)
