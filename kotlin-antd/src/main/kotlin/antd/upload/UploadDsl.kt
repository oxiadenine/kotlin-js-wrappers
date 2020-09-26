package antd.upload

import kotlinext.js.*
import react.*

fun RBuilder.upload(handler: RHandler<UploadProps>) = child(UploadComponent::class, handler)
fun RBuilder.dragger(handler: RHandler<DraggerProps>) = child(UploadComponent.Dragger, jsObject {}, handler)
