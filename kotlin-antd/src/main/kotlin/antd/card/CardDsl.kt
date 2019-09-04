package antd.card

import kotlinext.js.jsObject
import react.RBuilder
import react.RHandler

fun RBuilder.card(handler: RHandler<CardProps>) = child(CardComponent::class, handler)
fun RBuilder.cardGrid(handler: RHandler<CardGridProps>) = child(CardComponent.Grid, jsObject {}, handler)
fun RBuilder.cardMeta(handler: RHandler<CardMetaProps>) = child(CardComponent.Meta, jsObject {}, handler)
