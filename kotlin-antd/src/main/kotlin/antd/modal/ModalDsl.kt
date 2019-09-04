package antd.modal

import react.RBuilder
import react.RHandler

fun RBuilder.modal(handler: RHandler<ModalProps>) = child(ModalComponent::class, handler)
