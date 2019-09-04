package antd.tag

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.tag(handler: RHandler<TagProps>) = child(TagComponent::class, handler)
fun RBuilder.checkableTag(handler: RHandler<CheckableTagProps>) = child(TagComponent.CheckableTag, jsObject {}, handler)
