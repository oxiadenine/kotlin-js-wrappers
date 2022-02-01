package antd.upload

import kotlinext.js.*
import react.*

inline fun <T, reified UC : UploadComponent<T>> RBuilder.upload(noinline handler: RHandler<UploadProps<T>>) = child(UC::class, handler)
fun RBuilder.uploadDragger(handler: RHandler<DraggerProps>) = child(UploadComponent.Dragger, jso {}, handler)
