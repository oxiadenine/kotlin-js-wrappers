package antd.tag

import kotlinext.js.*
import react.*

fun RBuilder.tag(handler: RHandler<TagProps>) = child(TagComponent::class, handler)
fun RBuilder.checkableTag(handler: RHandler<CheckableTagProps>) = child(TagComponent.CheckableTag, jso {}, handler)
