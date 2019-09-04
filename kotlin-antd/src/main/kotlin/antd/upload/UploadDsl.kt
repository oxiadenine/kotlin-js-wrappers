package antd.upload

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.upload(handler: RHandler<UploadProps>) = child(UploadComponent::class, handler)
fun RBuilder.dragger(handler: RHandler<DraggerProps>) = child(UploadComponent.Dragger, jsObject {}, handler)
