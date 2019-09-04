package antd.affix

import react.RBuilder
import react.RHandler

fun RBuilder.affix(handler: RHandler<AffixProps>) = child(AffixComponent::class, handler)
