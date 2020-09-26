package antd.mentions

import kotlinext.js.*
import react.*

fun RBuilder.mentions(handler: RHandler<MentionsProps>) = child(MentionsComponent::class, handler)
fun RBuilder.option(handler: RHandler<OptionProps>) = child(MentionsComponent.Option, jsObject {}, handler)
