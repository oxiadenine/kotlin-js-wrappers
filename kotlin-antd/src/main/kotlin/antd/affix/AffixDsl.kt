package antd.affix

import react.*

fun RBuilder.affix(handler: RHandler<AffixProps>) = child(AffixComponent::class, handler)
