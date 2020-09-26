package antd.modal

import react.*

fun RBuilder.modal(handler: RHandler<ModalProps>) = child(ModalComponent::class, handler)
